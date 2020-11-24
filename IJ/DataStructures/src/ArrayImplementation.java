import java.lang.reflect.Array;

public class ArrayImplementation {

    public static void printIntArray(int[] array) {
        for (int i = 0; i < Array.getLength(array); i++) {
            System.out.printf("Element %d: %d%n", i, array[i]);
        }
    }

    public static int[] addToArray(int[] array, int newElement) {
        int index = Array.getLength(array);
        int[] newArray = new int[index + 1];

        int i;
        for (i = 0; i < index; i++) {
            newArray[i] = array[i];
        }
        newArray[i] = newElement;
        return newArray;
    }

}