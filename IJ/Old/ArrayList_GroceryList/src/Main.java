import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    // Creation of the OBJECT groceryList
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstructions();
        while(!quit) {
            System.out.print("Enter your choice:\n\t> ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    quit = true;
                    break;
            }
        }
    }

    public static void printInstructions() {
        System.out.println("\nPress:");
        System.out.println("\t 0 - To print choice actions.");
        System.out.println("\t 1 - To print the list of grocery items.");
        System.out.println("\t 2 - To add an item to the list.");
        System.out.println("\t 3 - To modify an item in the list.");
        System.out.println("\t 4 - To remove an item from the list.");
        System.out.println("\t 5 - To search for an item in the list.");
        System.out.println("\t 6 - To quit the application.");
    }

    public static void addItem() {
        System.out.print("Enter new item:\n\t> ");
        String item = scanner.next();
        groceryList.addGroceryItem(item);
    }

    public static void modifyItem() {
        System.out.print("Enter old item:\n\t> ");
        String oldItem = scanner.next();
        System.out.print("Enter new item:\n\t> ");
        String newItem = scanner.next();
        groceryList.modifyGroceryItem(oldItem, newItem);
    }

    public static void removeItem() {
        System.out.print("Enter item to remove:\n\t> ");
        String item = scanner.next();
        groceryList.removeGroceryItem(item);
    }

    public static void searchForItem() {
        System.out.print("Enter item to find:\n\t> ");
        String item = scanner.next();
        groceryList.findItem(item);
    }
}
