import org.junit.Assert;
import org.junit.Test;


public class ItTest {

    @Test
    public void IntegrationTest() {
        Handle handle = new Handle("Some name", 10, 10);

        Lock lock = new Lock(100);

        Assert.assertEquals(true, lock.unlock(handle.calculateKey()));
        Assert.assertEquals(false, lock.isLocked());
    }
}
