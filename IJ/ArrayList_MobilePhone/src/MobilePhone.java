import java.util.ArrayList;

public class MobilePhone {
    private ArrayList<Contact> contacts = new ArrayList<>();

    private void printContact(int index) {
        System.out.println((index + 1) + ". " + contacts.get(index).getFirstName()
                + " " + contacts.get(index).getLastName()
                + " " + contacts.get(index).getPhoneNumber());
    }

    public void listContacts() {
        if (contacts.isEmpty()) {
            System.out.println("No contacts in your list.");
            return;
        }

        for (int i = 0; i < contacts.size(); i++) {
            printContact(i);
        }
    }

    // Indices where a first name appears.
    private ArrayList<Integer> getFirstNameIndices(String firstName) {
        ArrayList<Integer> firstNameMatches = new ArrayList<>();
        if (contacts.isEmpty()) {
            return null;
        }

        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getFirstName().equals(firstName)) {
                firstNameMatches.add(i);
            }
        }
        return firstNameMatches;
    }

    // Indices where a last name appears.
    private ArrayList<Integer> getLastNameIndices(String lastName) {
        ArrayList<Integer> firstNameMatches = new ArrayList<>();
        if (contacts.isEmpty()) {
            return null;
        }

        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getFirstName().equals(lastName)) {
                firstNameMatches.add(i);
            }
        }
        return firstNameMatches;
    }

    // Indices where a phone number appears.
    private ArrayList<Integer> getPhoneNumberIndices(String phoneNumber) {
        ArrayList<Integer> firstNameMatches = new ArrayList<>();
        if (contacts.isEmpty()) {
            return null;
        }

        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getFirstName().equals(phoneNumber)) {
                firstNameMatches.add(i);
            }
        }
        return firstNameMatches;
    }

    // A contact is Unique: All indices must match.
    private int getContactIndex(Contact contact) {
        ArrayList<Integer> firstNameIndices = getFirstNameIndices(contact.getFirstName());
        ArrayList<Integer> lastNameIndices = getLastNameIndices(contact.getLastName());
        ArrayList<Integer> phoneNumberIndices = getPhoneNumberIndices(contact.getPhoneNumber());
        boolean indicesExist = !firstNameIndices.isEmpty()
                && !lastNameIndices.isEmpty()
                && !phoneNumberIndices.isEmpty();
        if (indicesExist) {
            for (int i = 0; i < firstNameIndices.size(); i++) {
                if (lastNameIndices.contains(firstNameIndices.get(i))
                        && phoneNumberIndices.contains((firstNameIndices.get(i)))) {
                    return firstNameIndices.get(i);
                }
            }
        }
        return -1;
    }

    public void addContact(Contact contact) {
        int contactIndex = getContactIndex(contact);
        if (contactIndex < 0) { // Contact doesn't exist
            contacts.add(contact);
            System.out.println(contact.getFirstName() + " successfully added.");
            return;
        }

        System.out.println("Contact already exists.");
    }

    public void removeContact(Contact contact) {
        int contactIndex = getContactIndex(contact);
        if (contactIndex < 0) { // Contact doesn't exist
            System.out.println("Contact does not exist!");
            return;
        }

        contacts.remove(contactIndex);
        System.out.println(contact.getFirstName() + " successfully removed.");
    }

    public void findContact(Contact contact) {
        int contactIndex = getContactIndex(contact);
        if (contactIndex < 0) { // Contact doesn't exist
            System.out.println("Contact does not exist!");
            return;
        }

        System.out.println("Contact exists!");
        printContact(contactIndex);
    }

    public void findFast(String name) {
        ArrayList<Integer> positions = new ArrayList<>();
        positions = getFirstNameIndices(name);
        positions.addAll(getLastNameIndices((name)));
        for (int i = 0; i < positions.size(); i++) {
            for (int j = i; j < positions.size(); j++) {
                if (positions.get(i).equals(positions.get(j))) {
                    positions.remove(j);
                }
            }
        }
        for (int i = 0; i < positions.size(); i++) {
            printContact(positions.get(i));
        }
    }

    public void modify(Contact oldContact, Contact newContact) {
        int oldContactIndex = getContactIndex(oldContact);
        if (oldContactIndex < 0) { // Contact doesn't exist
            System.out.println("Contact does not exist!");
            return;
        }

        int newContactIndex = getContactIndex(newContact);
        if (newContactIndex >= 0) { // New contact already exists!
            System.out.println("New contact already exists!");
            return;
        }

        contacts.set(oldContactIndex, newContact);
        System.out.println("Contact list successfully updated.");
    }
}
