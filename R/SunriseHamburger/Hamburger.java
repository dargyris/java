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
    private Art itsArt;

    // ============== Constructors ===========
    
    public Hamburger(){
        this( new Entity("B.T.O.\u2122 Hamburger", "Hamburger", 0.d, (short)1),             // Entity
              new AfricaSecret((short)1),       // Bread
              new BaseMeat((short)1), new WhaleBlubber(), new PigBabies(), // Meat
              new RhinoBV(), new BlinkingSC(), // Veggies
              new Art()); // Access to Art
    }

    // =========== Setter Constructor ========

    public Hamburger( Entity entity,
                      AfricaSecret africaSecret,
                      BaseMeat baseMeat,
                      WhaleBlubber whaleBlubber,
                      PigBabies pigBabies,
                      RhinoBV rhinoBV,
                      BlinkingSC blinkingSC,
                      Art art){
        this.itsEntity = entity;
        this.itsAfricaSecret = africaSecret;
        this.itsBaseMeat = baseMeat;
        this.itsWhaleBlubber = whaleBlubber;
        this.itsPigBabies = pigBabies;
        this.itsRhinoBV = rhinoBV;
        this.itsBlinkingSC = blinkingSC;
        this.itsArt = art;

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
                    this.itsEntity.setItsPrice( this.itsAfricaSecret.returnPrice()
                                    + this.itsBaseMeat.returnPrice() 
                                    + this.itsWhaleBlubber.returnPrice()
                                    + this.itsPigBabies.returnPrice()
                                    + this.itsRhinoBV.returnPrice()
                                    + this.itsBlinkingSC.returnPrice() );
                    return true;
                case 1:
                    threeTries = (short)3;
                    this.itsWhaleBlubber.setItsQty((short)(this.itsWhaleBlubber.getItsQty()+1));
                    break;
                case 2:
                    threeTries = (short)3;
                    this.itsPigBabies.setItsQty((short)(this.itsPigBabies.getItsQty()+1));
                    break;
                case 3:
                    threeTries = (short)3;
                    this.itsRhinoBV.setItsQty((short)(this.itsRhinoBV.getItsQty()+1));
                    break;
                case 4:
                    threeTries = (short)3;
                    this.itsBlinkingSC.setItsQty((short)(this.itsBlinkingSC.getItsQty()+1));
                    break;
                default:
                    if(threeTries > 0){
                        threeTries --;
                        break;
                    } 
                    return false;
            }
        }
        System.out.println( "Panic!" ); // Should not reach this point.
        return false;
    }

    // Prints ingredient choices with a different prompt each time.
    public void printOptions(short threeTries){
        this.itsArt.printArt(LOGO);
        System.out.println( "\t\t~ Build to Order Hamburger! ~" );
        System.out.println( "\t\tWith delicious " + this.itsAfricaSecret.getItsName() + " and " 
                + this.itsBaseMeat.getItsName() );
        System.out.println( "\t\tYou can add any four of the following:" );
        System.out.println();
        System.out.println( "\t\t1. " + this.itsWhaleBlubber.getItsName() + "\t\t\tQty: " + this.itsWhaleBlubber.getItsQty() );
        System.out.println( "\t\t2. " + this.itsPigBabies.getItsName() + "\t\t\t\tQty: " + this.itsPigBabies.getItsQty() );
        System.out.println( "\t\t3. " + this.itsRhinoBV.getItsName() + "\t\t\tQty: " + this.itsRhinoBV.getItsQty() );
        System.out.println( "\t\t4. " + this.itsBlinkingSC.getItsName() + "\t\t\t\tQty: " + this.itsBlinkingSC.getItsQty() );
        System.out.println( "\n\t\t0. That's enough. Thank you." );
        switch(threeTries){
            case 3:
                System.out.print( "\n\t\t> " );
                break;
            case 2:
                System.out.println( "\n\t\tYou need to concentrate now..." );
                System.out.print( "\n\t\t> " );
                break;
            case 1:
                System.out.println( "\n\t\tYou don't get this right, you don't eat." );
                System.out.print( "\n\t\t> " );
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

    public boolean serve(){
        this.itsArt.printArt(SERVE);
        this.itsArt.load((short)200);
        this.itsArt.printArt(BURGER);
        this.printServe();
        this.itsArt.interact();
        this.itsArt.printArt(LOGO);
        System.out.println( "\t\tWould you like to reorder?" );
        System.out.println( "\n\t\tYes please! \t--> 1" );
        System.out.println( "\t\tNo thank you.\t--> 0" );
        System.out.print( "\t\t> " );
        short choice = getInput();
        if( choice == (short)1){
            return true;
        }
        return false;
    }

    public void printServe(){
        System.out.println( "\t\t\t~ Hamburger ~" );
        this.itsAfricaSecret.printServe();
        this.itsBaseMeat.printServe();
        this.itsWhaleBlubber.printServe();
        this.itsPigBabies.printServe();
        this.itsRhinoBV.printServe();
        this.itsBlinkingSC.printServe();
        System.out.println();
        System.out.println( "\t\t~ Enjoy! :) ~");
    }

    public void printReceipt(){
        this.itsArt.printArt(LOGO);
        System.out.println( "\t\t\t~ Hamburger: Receipt ~\n" );
        this.itsAfricaSecret.printReceipt();
        this.itsBaseMeat.printReceipt();
        this.itsWhaleBlubber.printReceipt();
        this.itsPigBabies.printReceipt();
        this.itsRhinoBV.printReceipt();
        this.itsBlinkingSC.printReceipt();
        System.out.println( "\n\t\t-------------------------------------------------" );
        System.out.println( "\t\t\t\t\t\t~ Total: Fr. " + this.itsEntity.getItsPrice() );
        System.out.println( "\t\t=================================================" );
        System.out.print( "\t\t\t\t\t\t> " );
        this.itsArt.interact();
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
