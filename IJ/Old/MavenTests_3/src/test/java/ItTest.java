import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ItTest {
    @Test
    @DisplayName("Integration test")
    void IntegrationTest() {
        Handle handleGood = new Handle("Some name", 10, 10);
        Handle handleBad = new Handle("Some name", 10, 1);

        Lock lock = new Lock(100);

        Assertions.assertEquals(true, lock.unlock(handleGood.calculateKey()));
        Assertions.assertNotEquals(true, lock.unlock(handleBad.calculateKey()));
    }
}
