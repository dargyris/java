package org.example.i.lock;

import java.util.Date;
import java.util.List;

public class UserLoginChecker {

    public static final int MAX_LOCK_PERIOD_IN_MS = 60 * 60 * 1000;

    public Lock isUserAllowedToLogin(long id, String status, boolean isFirstScreen, User userTryingToLogin, List lockList) {
        if (lockList.size() <= 0 || lockList.get(0) == null) {
            return lockWriteAccess();
        }

        Object[] existingLock = (Object[]) lockList.get(0);
        String userIdWithLock = (String) existingLock[0];
        Date lockTimestamp = (Date) existingLock[1];

        if (userIdWithLock == null) {
            return lockWriteAccess();
        }

        if (userIdWithLock.equalsIgnoreCase(userTryingToLogin.getUserId())) {
            return lockWriteAccess();
        }

        long timeElapsedSinceLock = new Date().getTime() - lockTimestamp.getTime();
        if (timeElapsedSinceLock > MAX_LOCK_PERIOD_IN_MS && isFirstScreen) {
            return lockWriteAccess();
        }

        return createReadLockWithMessage(userIdWithLock);
    }

    private Lock createReadLockWithMessage(String userIdWithLock) {
        String lockMsgShownToUser = Constants.LOCK_TEXT.replaceAll("@@USER@@", userIdWithLock);
        Lock lck = new Lock();
        lck.setRead(true);
        lck.setLockReason(lockMsgShownToUser);
        return lck;
    }

    private Lock lockWriteAccess() {
        Lock lck = new Lock();
        lck.setRead(false);
        return lck;
    }
}