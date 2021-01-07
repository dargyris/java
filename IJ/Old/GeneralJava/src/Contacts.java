import java.util.ArrayList;

public class Contacts {
    private ArrayList<Contact> contacts = new ArrayList<Contact>();

    private boolean contactExists(Contact contact) {
        if (contacts.contains(contact)) {
            return true;
        }
        return false;
    }

    private int indexOfContact(Contact contact) {
        return contacts.indexOf(contact);
    }

    public void printContacts() {
        System.out.println("You have " + contacts.size() + " contacts.");
        for (int i = 0; i < contacts.size(); i++) {
            System.out.println("\n" + (i+1) + ".\t" + contacts.get(i).getFirstName()
            + " " + contacts.get(i).getLastName()
            + "\t" + contacts.get(i).getPhoneNo());
        }
    }

    public void addContact(Contact contact) {
        if (!contactExists(contact)) {
            contacts.add(contact);
        }
    }

    public void modifyContact(Contact oldContact, Contact newContact) {
        if (contactExists(oldContact)) {
            contacts.set(indexOfContact(oldContact), newContact);
        }
    }

    public void removeContact(Contact contact) {
        if (contactExists(contact)) {
            contacts.remove(contact);
        }
    }

    public void findContact(Contact contact) {
        if (contactExists(contact)) {
            System.out.println("Contact No.: " + contacts.indexOf(contact) + "\n");
        }
    }

}
