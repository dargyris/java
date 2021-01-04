import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class AListTest {
    @Nested
    @DisplayName("Create a List")
    class CreateList {
        private final AList alist = new AList(100);

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
            @DisplayName("add multiple objects")
            @ValueSource(ints = {0, 1, 2, 3, 4, 5})
            void addInts(int number) {
                alist.addFirst(Integer.valueOf(number));
                Assertions.assertEquals(number, alist.pop());
            }

            @Test
            @DisplayName("Peek first")
            void peekFirst() {
                alist.addFirst(Integer.valueOf(0));
                Assertions.assertEquals(Integer.valueOf(0), alist.peekFirst());
            }

            @Test
            @DisplayName("Peek last")
            void peekLast() {
                alist.addLast(Integer.valueOf(100));
                Assertions.assertEquals(Integer.valueOf(100), alist.peekLast());
            }
        }
    }
}
