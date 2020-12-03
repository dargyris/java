import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.printf("Enter number of elements:\n\t> ");
        int n = scanner.nextInt();
        int[] intArray = getIntegers(n);
        printArray(intArray);
        sortArray(intArray);
        printArray(intArray);
    }

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

    public static void sortArray(int[] array) {
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

//    public static void printArray(Object[] array) {
//        for (Object ar : array) {
//            System.out.print(ar + " ");
//        }
//        System.out.println();
//    }
}
