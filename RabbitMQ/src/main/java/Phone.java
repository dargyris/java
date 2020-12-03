import java.util.Scanner;

public class Phone {
    private static Scanner scanner = new Scanner(System.in);

    private static MobilePhone mobilePhone = new MobilePhone();

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printMenu();
        while (!quit) {
            System.out.print("Enter your choice\n\t> ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    printMenu();
                    break;
                case 2:
                    storeContact();
                    break;
                case 3:
                    modifyContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContact();
                    break;
            }

        }

    }

    public static void printMenu() {
        System.out.print("\033[H\033[2J");
    }

    public static void storeContact() {

    }

    public static void modifyContact() {

    }

    public static void removeContact() {

    }

    public static void queryContact() {

    }

}
