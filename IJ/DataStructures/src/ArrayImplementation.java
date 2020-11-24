import java.lang.reflect.Array;

public class ArrayImplementation {

    public static void printIntArray(int[] array) {
        System.out.printf("[ ");
        int arrayLength = Array.getLength(array);
        for (int i = 0; i < arrayLength; i++) {
            System.out.printf("%d ", array[i]);
        }
        System.out.printf("] Length: %d%n%n", arrayLength);
    }

    public static int[] addToTail(int[] array, int newElement) {
        int index = Array.getLength(array);
        int[] newArray = new int[index + 1];

        int i;
        for (i = 0; i < index; i++) {
            newArray[i] = array[i];
        }
        newArray[i] = newElement;
        return newArray;
    }

    public static int[] addToHead(int[] array, int newElement) {
        int index = Array.getLength(array);
        int[] newArray = new int[index + 1];

        int i = 0;
        newArray[i++] = newElement;
        while (i < index) {
            newArray[i+1] = array[i];
            i++;
        }
        return newArray;
    }

    public static int[] removeFromTail(int[] array) {
        int index = Array.getLength(array) - 1;
        int[] newArray = new int[index];

        for (int i = 0; i < index; i++) {
            newArray[i] = array[i];
        }
        return newArray;
    }

    public static int[] removeFromHead(int[] array) {
        int index = Array.getLength(array);
        int[] newArray = new int[index - 1];

        for (int i = 1; i < index; i++) {
            newArray[i-1] = array[i];
        }
        return newArray;
    }

}