import org.junit.Assert;
import org.junit.Test;

public class LockTest {
    @Test
    public void testLock() {
        Lock lock = new Lock(100);

        Assert.assertEquals(true, lock.isLocked());

        Assert.assertEquals(true, lock.unlock(100));
        Assert.assertEquals(false, lock.isLocked());

        lock.lock();
        Assert.assertEquals(true, lock.isLocked());
        Assert.assertEquals(false, lock.unlock(1));
        Assert.assertEquals(true, lock.isLocked());
    }
}
