import java.util.Scanner;

public class MobilePhone {
    private static Scanner scanner = new Scanner(System.in);
    private static Contacts contacts = new Contacts();

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
                    printContacts();
                    break;
                case 2:
                    addContact(getContact());
                    break;
                case 3:
                    Contact oldContact = getContact();
                    Contact newContact = getContact();
                    modifyContact(oldContact, newContact);
                    break;
                case 4:
                    removeContact(getContact());
                    break;
                case 5:
                    findContact(getContact());
                    break;
                case 6:
                    printMenu();
                    break;
            }

        }

    }

    public static void printMenu() {
        System.out.print("\033[H\033[2J");
        System.out.println("0. Quit Application.");
        System.out.println("1. Print contact list.");
        System.out.println("2. Add new contact.");
        System.out.println("3. Update existing contact.");
        System.out.println("4. Remove contact.");
        System.out.println("5. Find contact.");
        System.out.println("6. Print menu.");
    }

    public static Contact getContact() {
        String firstName = scanner.nextLine();
        String lastName = scanner.nextLine();
        String mobileNo = scanner.nextLine();
        return new Contact(firstName, lastName, mobileNo);
    }

    public static void printContacts() {
        contacts.printContacts();
    }

    public static void addContact(Contact contact) {
        contacts.addContact(contact);
    }

    public static void modifyContact(Contact oldContact, Contact newContact) {
        contacts.modifyContact(oldContact, newContact);
    }

    public static void removeContact(Contact contact) {
        contacts.removeContact(contact);
    }

    public static void findContact(Contact contact) {
        contacts.findContact(contact);
    }

}
