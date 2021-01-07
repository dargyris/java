import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LockTest {
    @Test
    @DisplayName("Check lock integrity")
    public void testLock() {
        Lock lock = new Lock(100);

        Assertions.assertEquals(true, lock.isLocked());
        Assertions.assertEquals(true, lock.unlock(100));
        Assertions.assertEquals(false, lock.isLocked());
        lock.lock();
        Assertions.assertEquals(true, lock.isLocked());
        Assertions.assertEquals(false, lock.unlock(1));
        Assertions.assertEquals(true, lock.isLocked());
    }
}
