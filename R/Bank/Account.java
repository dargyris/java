public class Account {

    // State of the Account
    private int accountNumber;      // Field accountNumber
    private double balance;         // Field balance
    private String customerName;    // Field customerName
    private String email;           // Field email
    private String phoneNumber;     // Field phoneNumber

    // Behavior of the Account
    // Setters
    public void setAccountNumber ( int accountNumber ){
        this.accountNumber = accountNumber;
    }
    public void setBalance ( double balance ){
        this.balance = balance;
    }
    public void setCustomerName ( String customerName ){
        this.customerName = customerName;
    }
    public void setEmail ( String email ){
        this.email = email;
    }
    public void setPhoneNumber ( String phoneNumber ){
        this.phoneNumber = phoneNumber;
    }

    
    // Getters
    public int getAccountNumber (){
        return this.accountNumber;
    }
    public double getBalance (){
        return this.balance;
    }
    public String getCustomerName (){
        return this.customerName;
    }
    public String getEmail (){
        return this.email;
    }
    public String getPhoneNumber (){
        return this.phoneNumber;
    }

    public double deposit ( double inMoney ){
        this.balance += inMoney;
        return this.balance;
    }
    public double withdraw ( double outMoney ){
        this.balance -= outMoney;
        return this.balance;
    }
        
}
