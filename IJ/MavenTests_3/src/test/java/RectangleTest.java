import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class RectangleTest {
    @Test
    @Disabled("Not implemented yet.")
    void name() {
        assertEquals(1, 2);
    }

    @Test
    @DisplayName("Should demonstrate a simple assertion.")
    void mane() {
        assertEquals(1, 1);
    }

    @Test
    @Disabled("This was made to fail!")
    void madeToFail() {
        fail("This is made to fail.");
    }

    @Test
    @DisplayName("This is not going to check all the values of the list.")
    @Disabled("This is written to fail at step 3. It won't check anything else after a fail.")
    void listTest() {
        List<Integer> numbers = List.of(2, 3, 5, 7);
        assertEquals(2, numbers.get(0));
        assertEquals(3, numbers.get(1));
        assertEquals(4, numbers.get(2));
        assertEquals(7, numbers.get(3));
    }

    @Test
    @DisplayName("Should only run if certain criteria is met.")
    @Disabled("Assumption will fail and the test will stop.")
    void conditionalTest() {
        Assumptions.assumeTrue(5 > 10);
        assertEquals(1, 1);
    }

    // ========================================================================================================

    @ParameterizedTest
    @DisplayName("Parameterized test. Despite errors, all values are being checked.")
    @ValueSource(ints = {3, 4, 5, 8, 14})
    void parameterizedTest(int sides) {
        Rectangle rectangle = new Rectangle(sides);
        assertEquals(sides, rectangle.getSides());
    }

    @ParameterizedTest
    @DisplayName("Should not create rectangles with sides that are != 4")
    @ValueSource(ints = {0, 1, 2, Integer.MAX_VALUE})
    void anotherParamTest(int sides) {
        assertThrows(IllegalArgumentException.class, () -> new Rectangle(sides));
    }

    // ========================================================================================================

    @Nested
    @DisplayName("When a rectangle is created,")
    class WhenRectangleExists {
        private final Rectangle rectA = new Rectangle();
//        private final Rectangle rectB = new Rectangle(5);
        private final Rectangle rectC = new Rectangle(10, "John");

        @Nested
        @DisplayName("Should allow")
        class ShouldAllow {
            @Test
            @DisplayName("Rectangles that have 4 sides only.")
            void checkSides() {
                assertEquals(4, rectA.getSides());
//                assertNotEquals(4, rectB.getSides());
                assertNotEquals(4, rectC.getSides());
            }

            @Test
            @DisplayName("Rectangles that are named rectangle only")
            void nameChecker() {
                assertEquals("Rectangle", rectA.getName());
//                assertNotEquals("Rectangle", rectB.getName());
                assertNotEquals("Rectangle", rectC.getName());
            }
        }

        @Nested
        @DisplayName("Should not")
        class ShouldNot {
            @Test
            @DisplayName("The name John should be definitely prohibited.")
            void invalidName() {
                assertNotEquals("John", rectA.getName());
            }
        }
    }
}
