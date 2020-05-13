public class Room extends PhysicalSpace{
    
    private Dimensions itsDimensions;
    private Chair itsChair;
    private Desk itsDesk;
    private Door itsDoor;
    private Window itsWindow;
    private Floor itsFloor;

    // =======================================

    public Room(){
        this((short)9, "Room",
//             new AbstractProperties((short)9, "RoomA"), // !b AbstractProperties implementation

             new Dimensions(2, 2, 2), 
             new Chair( new Dimensions(2, 2, 2),
                        new PhysicalProperties(2, 2, "Room", "Room"),
                        new AbstractProperties((short)2, "Room") 
                        ),
             new Desk ( new Dimensions(2, 2, 2),
                        new PhysicalProperties(2, 2, "Room", "Room"),
                        new AbstractProperties((short)2, "Room") 
                        ),
             new Door ( new Dimensions(2, 2, 2),
                        new PhysicalProperties(2, 2, "Room", "Room"),
                        new AbstractProperties((short)2, "Room") 
                        ),
             new Window( new Dimensions(2, 2, 2),
                         new PhysicalProperties(2, 2, "Room", "Room"),
                         new AbstractProperties((short)2, "Room") 
                         ),
             new Floor( 
                 new Tiles( new Dimensions(3, 3, 3),
                            new PhysicalProperties(3, 3, "Room", "Room"), 
                            new AbstractProperties((short)3, "Room") 
                            )
                      )
                 );
 
    }

    // ========== Setter Contructor ==========

    public Room( short volume,
                 String use,
//                 AbstractProperties properties,  // !b AbstractProperties implementation

                 Dimensions dimensions,
                 Chair chair,
                 Desk desk,
                 Door door,
                 Window window,
                 Floor floor){
        
        super(volume, use, new AbstractProperties((short)9, "RoomA"));
//        super(volume, use, properties);  // !b AbstractProperties implementation
    	this.itsDimensions = dimensions;
    	this.itsChair = chair;
    	this.itsDesk = desk;
    	this.itsDoor = door;
    	this.itsWindow = window;
    	this.itsFloor = floor;

    }

    // =======================================

    @Override
    public void printContent(){
        System.out.println( "Room --> " );
        this.itsChair.printContent();
        System.out.println();
        System.out.println( "Room --> " );
        this.itsDesk.printContent();
        System.out.println();
        System.out.println( "Room --> " );
        this.itsDoor.printContent();
        System.out.println();
        System.out.println( "Room --> " );
        this.itsWindow.printContent();
        System.out.println();
        System.out.println( "Room --> " );
        this.itsFloor.printContent();
        System.out.println();
    }

    // =============== Setters ===============

    public void setItsDimensions(Dimensions dimensions){
		this.itsDimensions = dimensions;
	}

    public void setItsChair(Chair chair){
		this.itsChair = chair;
	}

    public void setItsDesk(Desk desk){
		this.itsDesk = desk;
	}

    public void setItsDoor(Door door){
		this.itsDoor = door;
	}

    public void setItsWindow(Window window){
		this.itsWindow = window;
	}

    public void setItsFloor(Floor floor){
		this.itsFloor = floor;
	}


    // =============== Getters ===============

    public Dimensions getItsDimensions(){
		return this.itsDimensions;
	}

    public Chair getItsChair(){
		return this.itsChair;
	}

    public Desk getItsDesk(){
		return this.itsDesk;
	}

    public Door getItsDoor(){
		return this.itsDoor;
	}

    public Window getItsWindow(){
		return this.itsWindow;
	}

    public Floor getItsFloor(){
		return this.itsFloor;
	}



}
