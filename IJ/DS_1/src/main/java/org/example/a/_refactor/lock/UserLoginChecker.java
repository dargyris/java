package org.example.a._refactor.lock;

import java.util.Date;
import java.util.List;

    /* Conditionals that check the same condition:
       if (conditionA) {
            if (conditionB) { statement_B } --> Can be deleted!
            statement_A
        }

        if (conditionB) { statement_B } --> SUPERSET of the nested if above. So the nested one can be deleted.
    */

/*  Shuffling if statements up and down
    if a nested return, matches another return outside, the nested if can be simplified!
**/

/*  Redundant if statements:
    main() {
        if (statement_A) {
            if (statement_B) {
                return b;
            }
            return a; <-- REDUNDANT!
        }
        return a;
**/

public class UserLoginChecker {

    public static final int MAX_WAIT_TIME_IN_MS = 60 * 60 * 1000;

    public Lock isUserAllowedToLogin(long id, String status, boolean isFirstScreen, User userTryingToLogin, List lockList) {

        if (lockList.size() <= 0 || lockList.get(0) == null) {
            return writeLock();
        }

        Object[] existingLock = (Object[]) lockList.get(0);
        String userIdWithLock = (String) existingLock[0];
        Date lockTimestamp = (Date) existingLock[1];

        if (userIdWithLock == null) {
            return writeLock();
        }

        if (userIdWithLock.equalsIgnoreCase(userTryingToLogin.getUserId())) {
            return writeLock();
        }

        long timeElapsedSinceLock = new Date().getTime() - lockTimestamp.getTime();
        if (timeElapsedSinceLock > MAX_WAIT_TIME_IN_MS && isFirstScreen) {
            return writeLock();
        }

        return readLockWithMessage(userIdWithLock);
    }

    private Lock readLockWithMessage(String userIdWithLock) {
        String lockMsg = Constants.LOCK_TEXT.replaceAll("@@USER@@", userIdWithLock);
        Lock lck = new Lock();
        lck.setRead(true);
        lck.setLockReason(lockMsg);
        return lck;
    }

    private Lock writeLock() {
        Lock lck = new Lock();
        lck.setRead(false);
        return lck;
    }
}