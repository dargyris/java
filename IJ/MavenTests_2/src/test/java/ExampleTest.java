import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ExampleTest {
    @Test
    @Disabled("Not implemented yet")
    void name() {
        assertEquals(1, 2);
    }

    @Test
    @DisplayName("Should demonstrate a simple assertion")
    void mane() {
        assertEquals(1, 1);
    }

    @Test
    @Disabled("This was made to fail!")
    void madeToFail() {
        fail("This is made to fail.");
    }

    @Test
    void listTest() {
        List<Integer> numbers = List.of(2, 3, 5, 7);
        assertEquals(2, numbers.get(0));
        assertEquals(3, numbers.get(1));
        assertEquals(5, numbers.get(2));
        assertEquals(7, numbers.get(3));
    }

    @Test
    @DisplayName("Check all elements in a list")
    @Disabled("This test is designed to fail for all four cases.")
    void checkAllElements() {
        List<Integer> numbers = List.of(2, 3, 5, 7);
        Assertions.assertAll(() -> assertEquals(1, numbers.get(0)),
                () -> assertEquals(1, numbers.get(1)),
                () -> assertEquals(1, numbers.get(2)),
                () -> assertEquals(1, numbers.get(3)));
    }

    @Test
    @DisplayName("Should only run the test if some criteria are met.")
    @Disabled("Assumption will stop the test there since it is clearly set to fire.")
    void conditionalTest() {
        Assumptions.assumeTrue(5 > 10);
        assertEquals(1, 1);
    }

    //@ParameterizedTest (name = "{0}")
    @ParameterizedTest // The name is not necessary.
    @DisplayName("Parameterized test")
    @ValueSource(ints = {3, 4, 5, 8, 14})
    void parameterizedTest(int sides) {
        Rectangle shape = new Rectangle(sides);
        assertEquals(sides, shape.getSides());
    }

    @ParameterizedTest
    @DisplayName("Should not create shapes with invalid numbers of sides.")
    @ValueSource(ints = {0, 1, 2, Integer.MAX_VALUE})
    void anotherParamTest(int sides) {
        //Rectangle shape = new Rectangle(sides);
        assertThrows(IllegalArgumentException.class, () -> new Rectangle(sides));
    }

    @Nested
    @DisplayName("When a shape has been created.")
    class WhenShapeExists {
        private final Rectangle rectangle = new Rectangle(4);
        private final Rectangle badRectangle = new Rectangle(4, "John");

        @Nested
        @DisplayName("Should allow")
        class ShouldAllow {
            @Test
            @DisplayName("Seeing the number of sides")
            void seeingTheNumberOfSides() {
                assertEquals(4, rectangle.getSides());
            }

            @Test
            @DisplayName("Checking the description")
            void descriptionChecker() {
                assertEquals("Rectangle", rectangle.getName());
            }
        }

        @Nested
        @DisplayName("Should not")
        class ShouldNot {
            @Test
            @DisplayName("Invalid name. Only Rectangles allowed.")
            void invalidName() {
                assertNotEquals("John", rectangle.getName());
            }
        }
    }
}
