public class Account {

    private int accountNumber;      // Field accountNumber
    private int balance;            // Field balance
    private String customerName;    // Field customerName
    private String email;           // Field email
    private String phoneNumber;     // Field phoneNumber

    public void setAccountNumber ( int accountNumber ){
        this.accountNumber = accountNumber;
    }
    public void setBalance ( int balance ){
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


    public int getAccountNumber ( int accountNumber ){
        return this.accountNumber;
    }
    public int getBalance ( int balance ){
        return this.balance;
    }
    public String getCustomerName ( String customerName ){
        return this.customerName;
    }
    public String getEmail ( String email ){
        return this.email;
    }
    public String getPhoneNumber ( String phoneNumber ){
        return this.phoneNumber;
    }

//    public void withdraw (  ){
//        
//    }
//    public void deposit (  ){
//        
//    }
        
}
