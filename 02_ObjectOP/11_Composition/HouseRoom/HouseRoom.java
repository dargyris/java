import java.io.IOException;
import java.util.Scanner;

public class HouseRoom extends Room {

    private short itsWindowCount;
    private short itsDoorCount;
    private String itsFloorType;

    // ========== Setter Contructor ==========

    public HouseRoom(){
        this("Nill", 1, 1, (short)0, (short)0, "Nill");
    }

    public HouseRoom( String type,
                      int area,
                      int height,

                      short windowCount,
                      short doorCount,
                      String floorType){

        super(type, area, height);
    	this.itsWindowCount = windowCount;
    	this.itsDoorCount = doorCount;
    	this.itsFloorType = floorType;

    }

    // =======================================

    @Override
    public void printValues(){
        super.printValues();
        System.out.println( "Wind.\t> " + this.itsWindowCount );
        System.out.println( "Doors\t> " + this.itsDoorCount );
        System.out.println( "FType\t> " + this.itsFloorType );
    }

    public void setItsType(){
        System.out.print( "\n\t> Type?" );
        Scanner theScanner = new Scanner(System.in);
        super.setItsType(theScanner.nextLine());
    }

    public void setItsArea(){
        System.out.print( "\n\t> Area?" );
        Scanner theScanner = new Scanner(System.in);
        super.setItsArea(theScanner.nextInt());
    }

    public void setItsHeight(){
        System.out.print( "\n\t> Height" );
        Scanner theScanner = new Scanner(System.in);
        super.setItsHeight(theScanner.nextInt());
    }

    public void setItsWindowCount(){
        System.out.print( "\n\t> Windows?" );
        Scanner theScanner = new Scanner(System.in);
        this.itsWindowCount = (short)theScanner.nextInt();
    }

    public void setItsDoorCount(){
        System.out.print( "\n\t> Doors?" );
        Scanner theScanner = new Scanner(System.in);
        this.itsDoorCount = (short)theScanner.nextInt();
    }

    public void setItsFloorType(){
        System.out.print( "\n\t> Floor type?" );
        Scanner theScanner = new Scanner(System.in);
        this.itsFloorType = theScanner.nextLine();
    }
    // =============== Setters ===============

    private void setItsWindowCount(short windowCount){
		this.itsWindowCount = windowCount;
	}

    private void setItsDoorCount(short doorCount){
		this.itsDoorCount = doorCount;
	}

    private void setItsFloorType(String floorType){
		this.itsFloorType = floorType;
	}


    // =============== Getters ===============

    private short getItsWindowCount(){
		return this.itsWindowCount;
	}

    private short getItsDoorCount(){
		return this.itsDoorCount;
	}

    private String getItsFloorType(){
		return this.itsFloorType;
	}


}
