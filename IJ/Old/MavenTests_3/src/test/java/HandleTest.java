import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class HandleTest {
    @Test
    @DisplayName("Checking integrity of handling class")
    public void checkHandle() {
        Handle handle = new Handle("Handle", 10, 10);
        Assertions.assertEquals((Integer) 100, handle.calculateKey());
    }
}
