import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone();

    public static void main(String[] args) {

        boolean quit = false;
        boolean badInput = false;
        while (!quit) {
            int choice = 0;
            try {
                choice = printMenu(badInput);
            }catch (InputMismatchException e) {
                badInput = true;
                scanner.nextLine();
                continue;
            }
            switch (choice) {
                case 0: // Quit
                    quit = true;
                    break;
                case 1: // Print contacts
                    badInput = false;
                    printContacts();
                    scanner.nextLine();
                    break;
                case 2: // Add contact
                    badInput = false;
                    addContact();
                    scanner.nextLine();
                    break;
                case 3: // Remove contact
                    badInput = false;
                    removeContact();
                    scanner.nextLine();
                    break;
                case 4: // Find contact
                    badInput = false;
                    searchContact();
                    scanner.nextLine();
                    break;
                case 5: // Print menu
                    badInput = false;
                    printMenu(badInput);
                    break;
                case 6: // Fast search
                    badInput = false;
                    fastSearch();
                    scanner.nextLine();
                    break;
                case 7: // Modify contact
                    badInput = false;
                    modifyContact();
                    break;
                default: //Bad input
                    badInput = true;
                    continue;

            }

        }
        System.out.println("Goodbye.\n");
    }

    public static int printMenu(boolean badInput) {
        System.out.println("Mobile Phone v0.0");
        System.out.println("1. List Contacts");
        System.out.println("2. Add Contact");
        System.out.println("3. Remove Contact");
        System.out.println("4. Find Contact");
        System.out.println("5. Print Menu");
        System.out.println("6. Fast Search by Name string");
        System.out.println("7. Modify Contact");
        System.out.println("0. Quit Application");
        if (badInput) {
            System.out.println("\nBad input. Please try again.");
        }
        System.out.print("\t> ");
        return scanner.nextInt();
    }

    public static void printContacts() {
        mobilePhone.listContacts();
        scanner.nextLine();
    }

    public static Contact getContact() {
        System.out.print("First name: ");
        String firstName = scanner.next();
        System.out.print("Last name: ");
        String lastName = scanner.next();
        System.out.print("Phone number: ");
        String phoneNumber = scanner.next();
        Contact contact = new Contact(firstName, lastName, phoneNumber);
        return contact;
    }

    public static void addContact() {
        Contact contact = getContact();
        mobilePhone.addContact(contact);
        scanner.nextLine();
    }

    public static void removeContact() {
        Contact contact = getContact();
        mobilePhone.removeContact(contact);
        scanner.nextLine();
    }

    public static void searchContact() {
        Contact contact = getContact();
        mobilePhone.findContact(contact);
        scanner.nextLine();
    }

    public static void fastSearch() {
        System.out.print("Enter a string to match a name:\n\t> ");
        String name = scanner.next();
        mobilePhone.findFast(name);
        scanner.nextLine();
    }

    public static void modifyContact() {
        System.out.print("Please enter old contact details:\n");
        Contact oldContact = getContact();
        System.out.print("Please enter new contact details:\n");
        Contact newContact = getContact();
        mobilePhone.modify(oldContact, newContact);
        scanner.nextLine();
    }
}
