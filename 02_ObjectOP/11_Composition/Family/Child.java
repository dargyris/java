public class Child extends Human{

    // ============ Constructors ============

    public Child(){
        this(true, (short)10, (short)10, (short)10, "Child", "Child", "Child" );
    }

    // ========== Setter Constructor ========

    public Child( boolean alive,

                  short age,
                  short weight,
                  short height,
                  String gender,
                  String name,
                  String eyesColor){
        
        super(alive, age, weight, height, gender, name, eyesColor);
    }

    // =======================================
    @Override
    public void printDetails(){
        System.out.println( "\t~ Child: Human prints..." );
        super.printDetails();
        System.out.println();
        System.out.println( "Child END" );
        System.out.println( "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC" );
    }
}
