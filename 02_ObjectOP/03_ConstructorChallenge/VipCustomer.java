public class VipCustomer {

   private String itsName;
   private double itsCreditLimit;
   private String itsEmail;

   public VipCustomer(){    // Empty constructor

      this("Null", 1000., "Null");
      System.out.println( "Default value constructor called." ); 

   }

   public VipCustomer( String name,     // 2 Variable constructor
                       double creditLimit){

       this(name, creditLimit, "Nill");
       System.out.println( "2 value constructor called." );

   }

   public VipCustomer( String name,     // Storing constructor
                       double creditLimit,
                       String email){

      this.itsName = name;
      this.itsCreditLimit = creditLimit;
      this.itsEmail = email;
      System.out.println( "Storing constructor called." );

   }

   public String getItsName(){
      return this.itsName;
   }

   public void setItsName(String name){
      this.itsName = name;
   }

   public double getItsCreditLimit(){
      return this.itsCreditLimit;
   }

   public void setItsCreditLimit(double creditLimit){
      this.itsCreditLimit = creditLimit;
   }
   
   public String getItsEmail(){
      return this.itsEmail;
   }

    public void setItsEmail(String email){
      this.itsEmail = email;
    }

}
