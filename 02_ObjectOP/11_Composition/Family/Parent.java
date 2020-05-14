public class Parent extends Human{

    private Child itsChild;

    // ============== Constructors ===========

    public Parent(){
        this(true, (short)50, (short)50, (short)50, "Parent", "Parent", "Parent", 
              new Child(true, (short)50, (short)50, (short)50, "Parent", "Parent", "Parent")
              );
    }

    // =========== Setter Constructor ========

    public Parent( boolean alive,
                    
                   short age,
                   short weight,
                   short height,
                   String gender,
                   String name,
                   String eyesColor,

                   Child child){
        
        super(alive, age, weight, height, gender, name, eyesColor);
    	this.itsChild = child;

    }

    // =======================================
    @Override
    public void printDetails(){
        System.out.println( "\t~ Parent: Human prints..." );
        super.printDetails();
        System.out.println();
        System.out.println( "\t~ Parent : Child prints..." );
        this.itsChild.printDetails();
        System.out.println();
        System.out.println( "Parent END" );
        System.out.println( "PPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPP" );
    }

    // =============== Setters ===============

    public void setItsChild(Child child){
		this.itsChild = child;
	}


    // =============== Getters ===============

    public Child getItsChild(){
		return this.itsChild;
	}


}
