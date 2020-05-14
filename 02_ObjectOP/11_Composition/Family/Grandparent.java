public class Grandparent extends Human{

    private Child itsChild;
    private Parent itsParent;

    // ============== Constructors ===========

    public Grandparent(){
        this( true, (short)100, (short)100, (short)100, 
              "Grandparent", "Grandparent", "Grandparent",
              new Parent(true, (short)100, (short)100, (short)100, 
                         "Grandparent", "Grandparent", "Grandparent",
                         new Child(true, (short)100, (short)100, (short)100, 
                         "Grandparent", "Grandparent", "Grandparent"
                         )
              ),
              new Child(true, (short)100, (short)100, (short)100, 
                         "Grandparent", "Grandparent", "Grandparent"
                         )
              );
    }

    // =========== Setter Constructor ========

    public Grandparent( boolean alive,

                        short age,
                        short weight,
                        short height,
                        String gender,
                        String name,
                        String eyesColor,

                        Parent parent,
                        Child child){ 
        
        super(alive, age, weight, height, gender, name, eyesColor);
    	this.itsParent = parent;
    	this.itsChild = child;

    }

    // =======================================

    @Override
    public void printDetails(){
        System.out.println( "\t~ Grandparent: Human prints..." );
        super.printDetails();
        System.out.println();
        System.out.println( "\t~ Grandparent: Parent prints..." );
        this.itsParent.printDetails();
        System.out.println();
        System.out.println( "\t~ Grandparent: Child prints..." );
        this.itsChild.printDetails();
        System.out.println();
        System.out.println( "Grandparent END." );
        System.out.println( "GGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGG" );
    }

    // =============== Setters ===============

    public void setItsChild(Child child){
		this.itsChild = child;
	}

    public void setItsParent(Parent parent){
		this.itsParent = parent;
	}


    // =============== Getters ===============

    public Child getItsChild(){
		return this.itsChild;
	}

    public Parent getItsParent(){
		return this.itsParent;
	}


}
