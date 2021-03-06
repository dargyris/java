public class Contact {
    private String firstName;
    private String lastName;
    private String phoneNumber;

    // Empty constructor
    public Contact() {}

    // Constructor just for name input
    public Contact(String firstName) {
        this.firstName = firstName;
    }

//    public static Contact createContact(String fName, String lName, String pNumber) {
//        return new Contact(fName, lName, pNumber);
//    }

    // Constructor for all data
    public Contact(String firstName, String lastName, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

}
