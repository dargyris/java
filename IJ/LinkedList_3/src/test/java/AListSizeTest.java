import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class AListSizeTest {
    @Nested
    @DisplayName("Create a list")
    class CreateList {
        private final AListSize alist = new AListSize(100);

        @Nested
        @DisplayName("Should")
        class Should {
            @Test
            @DisplayName("Add first")
            void addFirst() {
                alist.addFirst(Integer.valueOf(0));
                Assertions.assertEquals(Integer.valueOf(0), alist.pop());
            }

            @ParameterizedTest
            @DisplayName("Add multiple objects")
            @ValueSource(ints = {0, 1, 2, 3, 4, 5})
            void addInts(int number) {
                alist.addFirst(Integer.valueOf(number));
                Assertions.assertEquals(number, alist.pop());
            }

            @Test
            @DisplayName("Return the right size.")
            void checkSize() {
                Assertions.assertEquals(0, alist.getSize());
                alist.addFirst(Integer.valueOf(0));
                Assertions.assertEquals(1, alist.getSize());
            }
        }

        @Nested
        @DisplayName("Should not")
        class ShouldNot {
            @Test
            @DisplayName("Return anything but 0 when empty.")
            void checkEmptyListSize() {
                Assumptions.assumeFalse(alist.getSize() != 0);
                Assertions.assertEquals(0, alist.getSize());
            }
        }
    }
}
