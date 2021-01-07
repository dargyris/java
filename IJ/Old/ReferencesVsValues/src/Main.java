import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int intVal = 10;
        int anotherIntVal = intVal;
        System.out.println("intVal: " + intVal);
        System.out.println("anotherIntVal: " + anotherIntVal);
        System.out.println();

        anotherIntVal++;
        System.out.println("intVal: " + intVal);
        System.out.println("anotherIntVal: " + anotherIntVal);
        System.out.println();

        int[] myIntArray = new int[5];
        int[] anotherArray = myIntArray;

        System.out.println("myIntArray: " + Arrays.toString(myIntArray));
        System.out.println("anotherArray: " + Arrays.toString(anotherArray));
        System.out.println();

        anotherArray[0] = 1;
        System.out.println("After change:");
        System.out.println("myIntArray: " + Arrays.toString(myIntArray));
        System.out.println("anotherArray: " + Arrays.toString(anotherArray));
        System.out.println();

        modifyArray(myIntArray);
        System.out.println("After modify:");
        System.out.println("myIntArray: " + Arrays.toString(myIntArray));
        System.out.println("anotherArray: " + Arrays.toString(anotherArray));
    }

    private static void modifyArray(int[] array) {
        array[0] = 2;
        array = new int[] {1};
    }
}
