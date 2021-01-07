import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner s = new Scanner(System.in);
    private static char[] chArray;

    public static void main(String[] args) {
        System.out.println("How many characters?");
        int num = s.nextInt();
        chArray = new char[num];
        System.out.println("Enter " + num + " characters:");
        getInput();
        printArray(chArray);
        System.out.println("New size?");
        num = s.nextInt();
        char[] original = resizeArray(num);
        getInput();
        printArray(chArray);
        printArray(original);
    }

    private static void getInput() {
        for (int i = 0; i < chArray.length; i++) {
            chArray[i] = s.next().charAt(0);
        }
    }

    private static void printArray(char[] array) {
        System.out.println(Arrays.toString(array));
    }

    private static char[] resizeArray(int num) {
        char[] original = chArray;
        chArray = new char[num];
        if (original.length < chArray.length) {
            for (int i = 0; i < original.length; i++) {
                chArray[i] = original[i];
            }
        } else {
            for (int i = 0; i < chArray.length; i++) {
                chArray[i] = original[i];
            }
        }
        return original;
    }
}
