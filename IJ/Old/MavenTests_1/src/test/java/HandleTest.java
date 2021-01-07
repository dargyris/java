import org.junit.Assert;
import org.junit.Test;

public class HandleTest {
    @Test
    public void test() {
        Handle handle = new Handle("Handle", 10, 10);
        Assert.assertEquals(handle.calculateKey(), (Integer)100);
    }
}
