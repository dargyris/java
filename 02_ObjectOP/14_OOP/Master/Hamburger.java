import java.io.IOException;
import java.util.Scanner;

public class Hamburger {

    public static short LOGO = (short)0;
    public static short BURGER = (short)1;
    public static short DELUXE = (short)2;
    public static short SERVE = (short)3;

    private Entity itsEntity;
    private AfricaSecret itsAfricaSecret;
    private BaseMeat itsBaseMeat;
    private WhaleBlubber itsWhaleBlubber;
    private PigBabies itsPigBabies;
    private RhinoBV itsRhinoBV;
    private BlinkingSC itsBlinkingSC;

    // ============== Constructors ===========
    
    public Hamburger(){
        this( new Entity(),             // Entity
              new AfricaSecret(),       // Bread
              new BaseMeat(), new WhaleBlubber(), new PigBabies(), // Meat
              new RhinoBV(), new BlinkingSC());                    // Veggies
    }

    // =========== Setter Constructor ========

    public Hamburger( Entity entity,
                      AfricaSecret africaSecret,
                      BaseMeat baseMeat,
                      WhaleBlubber whaleBlubber,
                      PigBabies pigBabies,
                      RhinoBV rhinoBV,
                      BlinkingSC blinkingSC){
        this.itsEntity = entity;
        this.itsAfricaSecret = africaSecret;
        this.itsBaseMeat = baseMeat;
        this.itsWhaleBlubber = whaleBlubber;
        this.itsPigBabies = pigBabies;
        this.itsRhinoBV = rhinoBV;
        this.itsBlinkingSC = blinkingSC;

    }

    // =======================================

    public boolean order(){
        short choice = -1;
        short threeTries = (short)3;
        while(threeTries > 0) {
            this.printOptions(threeTries);
            choice = (short)this.getInput();
            switch(choice){
                case 0:
                    return true;
                case 1:
                    
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                default:
                    if(threeTries > 0){
                        break;
                    }
                    return false;
            }
            threeTries --;
        }
        return true;
    }

    // Prints ingredient choices with a different prompt each time.
    public void printOptions(short threeTries){
        System.out.println( "\t~ Build to Order Hamburger! ~" );
        System.out.println( "\tWith delicious " + this.itsAfricaSecret.getItsName() + " bread." );
        System.out.println( "\tAnd " + this.itsBaseMeat.getItsName() + " base meat." );
        System.out.println( "\tYou can add any four of the following:" );
        System.out.println();
        System.out.println( "\t1. " + this.itsWhaleBlubber.getItsName() );
        System.out.println( "\t2. " + this.itsPigBabies.getItsName() );
        System.out.println( "\t3. " + this.itsRhinoBV.getItsName() );
        System.out.println( "\t4. " + this.itsBlinkingSC.getItsName() );
        System.out.println( "\n\t0. That's enough. Thank you." );

        switch(threeTries){
            case 3:
                System.out.println( "\n\t" );
                break;
            case 2:
                System.out.println( "\n\tYou need to concentrate new..." );
                System.out.println( "\t> " );
                break;
            case 1:
                System.out.println( "\n\tYou don't get this right, you don't eat." );
                System.out.println( "\t> " );
                break;
            default:
                System.out.println( "Panic!" );
                break;
        }
    }

    // Verifies input range: [0, 10]. Otherwise -1.
    public short getInput(){
        short choice = -1;
        Scanner theScanner = new Scanner(System.in);
        boolean choiceFlag = theScanner.hasNextInt();
        if(choiceFlag){
            choice = (short)theScanner.nextInt();
            if( choice >= 0 && choice <= 10 ) {
                theScanner.nextLine();
                return choice;
            }
        }
        theScanner.nextLine();
        return -1;
    }

    public short serve(){
        Art theArt = new Art();
        theArt.printArt(SERVE);
        theArt.wait((short)300);
        theArt.printArt(BURGER);
        this.printProperties();
        theArt.wait((short)200);
        theArt.printArt(LOGO);
        Scanner theScanner = new Scanner(System.in);
        System.out.println( "\tWould you like to reorder?" );
        System.out.println( "\tYes please! \t--> 1" );
        System.out.println( "\tNo thank you\t--> 0" );
        short choice = getInput();
        if( choice == (short)1){
            return 10;
        }
        return 0; // In main, choice 0 is exit
    }

    public void printProperties(){
        System.out.println( "\t~ Hamburger ~" );
        this.itsAfricaSecret.printProperties();
        this.itsBaseMeat.printProperties();
        this.itsWhaleBlubber.printProperties();
        this.itsRhinoBV.printProperties();
        this.itsBlinkingSC.printProperties();
    }


    // =============== Setters ===============

    public void setItsEntity(Entity entity){
		this.itsEntity = entity;
	}

    public void setItsAfricaSecret(AfricaSecret africaSecret){
		this.itsAfricaSecret = africaSecret;
	}

    public void setItsBaseMeat(BaseMeat baseMeat){
		this.itsBaseMeat = baseMeat;
	}

    public void setItsWhaleBlubber(WhaleBlubber whaleBlubber){
		this.itsWhaleBlubber = whaleBlubber;
	}

    public void setItsPigBabies(PigBabies pigBabies){
		this.itsPigBabies = pigBabies;
	}

    public void setItsRhinoBV(RhinoBV rhinoBV){
		this.itsRhinoBV = rhinoBV;
	}

    public void setItsBlinkingSC(BlinkingSC blinkingSC){
		this.itsBlinkingSC = blinkingSC;
	}



    // =============== Getters ===============

    public Entity getItsEntity(){
		return this.itsEntity;
	}

    public AfricaSecret getItsAfricaSecret(){
		return this.itsAfricaSecret;
	}

    public BaseMeat getItsBaseMeat(){
		return this.itsBaseMeat;
	}

    public WhaleBlubber getItsWhaleBlubber(){
		return this.itsWhaleBlubber;
	}

    public PigBabies getItsPigBabies(){
		return this.itsPigBabies;
	}

    public RhinoBV getItsRhinoBV(){
		return this.itsRhinoBV;
	}

    public BlinkingSC getItsBlinkingSC(){
		return this.itsBlinkingSC;
	}




}
