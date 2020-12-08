import java.util.ArrayList;

public class MobilePhone {
    private ArrayList<Contact> contacts;

    public MobilePhone() {
        contacts = new ArrayList<>();
    }

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
        ArrayList<Integer> firstNameIndices = new ArrayList<>();
        if (contacts.isEmpty()) {
            return null;
        }

        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getFirstName().equals(firstName)) {
                firstNameIndices.add(i);
            }
        }
        return firstNameIndices;
    }

    // Indices where a last name appears.
    private ArrayList<Integer> getLastNameIndices(String lastName) {
        ArrayList<Integer> lastNameIndices = new ArrayList<>();
        if (contacts.isEmpty()) {
            return null;
        }

        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getLastName().equals(lastName)) {
                lastNameIndices.add(i);
            }
        }
        return lastNameIndices;
    }

    // Indices where a phone number appears.
    private ArrayList<Integer> getPhoneNumberIndices(String phoneNumber) {
        ArrayList<Integer> phoneNumberIndices = new ArrayList<>();
        if (contacts.isEmpty()) {
            return null;
        }

        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getPhoneNumber().equals(phoneNumber)) {
                phoneNumberIndices.add(i);
            }
        }
        return phoneNumberIndices;
    }

    // A contact is Unique: All indices must match. Returns the index of the contact.
    private int getContactIndex(Contact contact) {
        ArrayList<Integer> firstNameIndices = getFirstNameIndices(contact.getFirstName());
        ArrayList<Integer> lastNameIndices = getLastNameIndices(contact.getLastName());
        ArrayList<Integer> phoneNumberIndices = getPhoneNumberIndices(contact.getPhoneNumber());
        boolean indicesExist = !(firstNameIndices == null)
                && !(lastNameIndices == null)
                && !(phoneNumberIndices == null);
        if (!indicesExist) {    // One or more index checkers are empty. Contact does not exist.
            return -1;
        }

        // Match checker. All three indices must match for the contact to already exist.
        // Contacts are unique. When match found, that is the one. It can return.
        for (int i = 0; i < firstNameIndices.size(); i++) {
            int firstNameIndex = firstNameIndices.get(i);
            if (lastNameIndices.contains(firstNameIndex)
                    && phoneNumberIndices.contains(firstNameIndex)) {
                return firstNameIndex;
            }
        }

        return -1;  // Match checker failed. Contact does not exist.
    }

    public void addContact(Contact contact) {
        int contactIndex = getContactIndex(contact);    // If empty list or unique new contact returns -1.
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
        positions.addAll(getFirstNameIndices(name));
        positions.addAll(getLastNameIndices(name));
        System.out.println(positions.toString());
        for (int i = 0; i < positions.size() - 1; i++) {    // Remove duplicate appearances when fName == lName
            for (int j = i + 1; j < positions.size(); j++) {
                if (positions.get(i).equals(positions.get(j))) {
                    positions.remove(j);
                }
            }
        }
        System.out.println(positions.toString());
        for (int i = 0; i < positions.size(); i++) {
            printContact(positions.get(i));
        }
    }

    public void modify(Contact oldContact, Contact newContact) {
        int oldContactIndex = getContactIndex(oldContact);
        if (oldContactIndex < 0) { // Contact doesn't exist
            System.out.println("Old contact does not exist!");
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
