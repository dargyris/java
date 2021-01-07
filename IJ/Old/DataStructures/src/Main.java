import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        int subLength = 0;
        for (int i = 0; i < n; i++) {
             subLength += n - i;
        }

        int[] subArray = new int[subLength];
        int counter = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                for (int k = j; k < n - i + j; k++) {
                    subArray[counter] += array[k];
                }
                counter++;
            }
        }

        System.out.printf("%n[ ");
        for (int ar : subArray) {
            System.out.printf("%d ", ar);
        }
        System.out.printf("]");

    }
}