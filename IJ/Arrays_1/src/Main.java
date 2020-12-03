import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Enter number of elements:\n\t> ");
        int n = scanner.nextInt();
        int[] intArray = getIntegers(n);
//        int[] arrayCopy = new int[intArray.length];
        int[] arrayCopy = Arrays.copyOf(intArray, intArray.length);
//        copyArray(intArray, arrayCopy);
        printArray(intArray);
        printArray(arrayCopy);
        System.out.println();
        Arrays.sort(intArray, 0, intArray.length);
        Arrays.sort(arrayCopy, 0, intArray.length);
        printArray(intArray);
        printArray(arrayCopy);
        System.out.println();
        sortArrayI(intArray);
        sortArrayII(arrayCopy);
        printArray(intArray);
        printArray(arrayCopy);
    }

//    public static void copyArray(int[] array, int[] arrayCopy) {
//        for (int i = 0; i < array.length; i ++) {
//            arrayCopy[i] = array[i];
//        }
//    }

    public static int[] getIntegers(int n) {

        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void printArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }

    public static void sortArrayI(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if (array[i] < array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    public static void sortArrayII(int[] array) {
        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] < array[i+1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    flag = true;
                }
            }
        }
    }

//    public static void printArray(Object[] array) {
//        for (Object ar : array) {
//            System.out.print(ar + " ");
//        }
//        System.out.println();
//    }
}
