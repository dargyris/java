import java.io.IOException;
import java.util.Scanner;

public class Natura {

    public static short LOGO = (short)0;
    public static short BURGER = (short)1;
    public static short DELUXE = (short)2;
    public static short SERVE = (short)3;

    private Entity itsEntity;
    private GoldenTouch itsGoldenTouch;
    private DiamondCrumbs itsDiamondCrumbs;
    private NarwhalBacon itsNarwhalBacon; 
    private EndangeredPenguin itsEndangeredPenguin; 
    private SpaceAlgae itsSpaceAlgae; 
    private SeahorseUF itsSeahorseUF; 
    private FishermanLB itsFishermanLB;
    private Art itsArt;

    // ============== Constructors ===========
    
    public Natura(){
        this( new Entity("Natura\u2122 Hamburger", "Hamburger", 0.d, (short)1), // to store its properties
              new GoldenTouch((short)1), new DiamondCrumbs((short)0),           // Bread types
              new NarwhalBacon(), new EndangeredPenguin(),                      // Meat types
              new SpaceAlgae(), new SeahorseUF(), new FishermanLB(),            // Veggie types
              new Art()); // Access to Art
    }

    // =========== Setter Constructor ========

    public Natura( Entity entity,
                   GoldenTouch goldenTouch,
                   DiamondCrumbs diamondCrumbs,
                   NarwhalBacon narwhalBacon,
                   EndangeredPenguin endangeredPenguin,
                   SpaceAlgae spaceAlgae,
                   SeahorseUF seahorseUF,
                   FishermanLB fishermanLB,
                   Art art){
        this.itsEntity = entity;
        this.itsGoldenTouch = goldenTouch;
        this.itsDiamondCrumbs = diamondCrumbs;
        this.itsNarwhalBacon = narwhalBacon; 
        this.itsEndangeredPenguin = endangeredPenguin;
        this.itsSpaceAlgae = spaceAlgae; 
        this.itsSeahorseUF = seahorseUF;
        this.itsFishermanLB = fishermanLB; 
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
                    this.itsEntity.setItsPrice( this.itsGoldenTouch.returnPrice()
                                    + this.itsDiamondCrumbs.returnPrice() 
                                    + this.itsNarwhalBacon.returnPrice()
                                    + this.itsEndangeredPenguin.returnPrice()
                                    + this.itsSpaceAlgae.returnPrice()
                                    + this.itsSeahorseUF.returnPrice()
                                    + this.itsFishermanLB.returnPrice() );
                    return true;
                case 1:
                    threeTries = (short)3;
                    this.itsDiamondCrumbs.setItsQty((short)(this.itsDiamondCrumbs.getItsQty()+1));
                    break;
                case 2:
                    threeTries = (short)3;
                    this.itsNarwhalBacon.setItsQty((short)(this.itsNarwhalBacon.getItsQty()+1));
                    break;
                case 3:
                    threeTries = (short)3;
                    this.itsEndangeredPenguin.setItsQty((short)(this.itsEndangeredPenguin.getItsQty()+1));
                    break;
                case 4:
                    threeTries = (short)3;
                    this.itsSpaceAlgae.setItsQty((short)(this.itsSpaceAlgae.getItsQty()+1));
                    break;
                case 5:
                    threeTries = (short)3;
                    this.itsSeahorseUF.setItsQty((short)(this.itsSeahorseUF.getItsQty()+1));
                    break;
                case 6:
                    threeTries = (short)3;
                    this.itsFishermanLB.setItsQty((short)(this.itsFishermanLB.getItsQty()+1));
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
        System.out.println( "\t\tWith delicious " + this.itsGoldenTouch.getItsName() );
        System.out.println( "\t\tYou can add any four of the following:" );
        System.out.println();
        System.out.println( "\t\t1. " + this.itsDiamondCrumbs.getItsName() + "\t\t\tQty: " + this.itsDiamondCrumbs.getItsQty() );
        System.out.println( "\t\t2. " + this.itsNarwhalBacon.getItsName() + "\t\t\tQty: " + this.itsNarwhalBacon.getItsQty() );
        System.out.println( "\t\t3. " + this.itsEndangeredPenguin.getItsName() + "\t\t\t\tQty: " + this.itsEndangeredPenguin.getItsQty() );
        System.out.println( "\t\t4. " + this.itsSpaceAlgae.getItsName() + "\t\t\t\tQty: " + this.itsSpaceAlgae.getItsQty() );
        System.out.println( "\t\t5. " + this.itsSeahorseUF.getItsName() + "\t\t\t\tQty: " + this.itsSeahorseUF.getItsQty() );
        System.out.println( "\t\t6. " + this.itsFishermanLB.getItsName() + "\t\t\tQty: " + this.itsFishermanLB.getItsQty() );
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
        this.itsGoldenTouch.printServe();
        this.itsDiamondCrumbs.printServe();
        this.itsNarwhalBacon.printServe();
        this.itsEndangeredPenguin.printServe();
        this.itsSpaceAlgae.printServe();
        this.itsSeahorseUF.printServe();
        this.itsFishermanLB.printServe();
        System.out.println();
        System.out.println( "\t\t~ Enjoy! :) ~");
    }

    public void printReceipt(){
        this.itsArt.printArt(LOGO);
        System.out.println( "\t\t\t~ Hamburger: Receipt ~\n" );
        this.itsGoldenTouch.printReceipt();
        this.itsDiamondCrumbs.printReceipt();
        this.itsNarwhalBacon.printReceipt();
        this.itsEndangeredPenguin.printReceipt();
        this.itsSpaceAlgae.printReceipt();
        this.itsSeahorseUF.printReceipt();
        this.itsFishermanLB.printReceipt();
        System.out.println( "\n\t\t----------------------------------------------------------" );
        System.out.println( "\t\t\t\t\t\t\t~ Total: Fr. " + this.itsEntity.getItsPrice() );
        System.out.println( "\t\t==========================================================" );
        System.out.print( "\t\t\t\t\t\t\t> " );
        this.itsArt.interact();
    }

    // =============== Setters ===============

    public void setItsEntity(Entity entity){
		this.itsEntity = entity;
	}

    public void setItsGoldenTouch(GoldenTouch goldenTouch){
		this.itsGoldenTouch = goldenTouch;
	}

    public void setItsDiamondCrumbs(DiamondCrumbs diamondCrumbs){
		this.itsDiamondCrumbs = diamondCrumbs;
	}

    public void setItsNarwhalBacon(NarwhalBacon narwhalBacon){
		this.itsNarwhalBacon = narwhalBacon;
	}

    public void setItsEndangeredPenguin(EndangeredPenguin endangeredPenguin){
		this.itsEndangeredPenguin = endangeredPenguin;
	}

    public void setItsSpaceAlgae(SpaceAlgae spaceAlgae){
		this.itsSpaceAlgae = spaceAlgae;
	}

    public void setItsSeahorseUF(SeahorseUF seahorseUF){
		this.itsSeahorseUF = seahorseUF;
	}

    public void setItsFishermanLB(FishermanLB fishermanLB){
		this.itsFishermanLB = fishermanLB;
	}

    public void setItsArt(Art art){
		this.itsArt = art;
	}


    // =============== Getters ===============

    public Entity getItsEntity(){
		return this.itsEntity;
	}

    public GoldenTouch getItsGoldenTouch(){
		return this.itsGoldenTouch;
	}

    public DiamondCrumbs getItsDiamondCrumbs(){
		return this.itsDiamondCrumbs;
	}

    public NarwhalBacon getItsNarwhalBacon(){
		return this.itsNarwhalBacon;
	}

    public EndangeredPenguin getItsEndangeredPenguin(){
		return this.itsEndangeredPenguin;
	}

    public SpaceAlgae getItsSpaceAlgae(){
		return this.itsSpaceAlgae;
	}

    public SeahorseUF getItsSeahorseUF(){
		return this.itsSeahorseUF;
	}

    public FishermanLB getItsFishermanLB(){
		return this.itsFishermanLB;
	}

    public Art getItsArt(){
		return this.itsArt;
	}


    

}
