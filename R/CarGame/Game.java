import java.io.IOException;
import java.util.Scanner;

public class Game {
    
    private int itsSpeed;
    private int itsMaxSpeed;
    private int itsDirection;

    // ========== Setter Contructor ==========

    public Game(){
        this(0, 0, 0);
    }

    public Game( int speed,
               int maxSpeed,
               int direction){

    	this.itsSpeed = speed;
    	this.itsMaxSpeed = maxSpeed;
    	this.itsDirection = direction;

    }

    // =======================================

    public boolean game(){
        boolean gameFlag = true;
        GameArt.gameArt();
        System.out.println( "\tSpeed: " + this.itsSpeed );
        System.out.println( "\tDireciton: " + this.itsDirection );
        gameFlag = inputHandler();
        return gameFlag;
    }

    public boolean inputHandler(){
        Scanner theScanner = new Scanner ( System.in );
        char myChar = theScanner.next().charAt(0);
        switch(myChar) {
            case 'w':
                this.itsSpeed+=1;
                break;
            case 's':
                if(this.itsSpeed >= 1){
                    this.itsSpeed-=1;
                }
                break;
            case 'a':
                this.itsDirection-=1;
                break;
            case 'd':
                this.itsDirection+=1;
                break;
            default:
                return false;
        }
        handleMaxSpeed();
        return true;
        
    }

    public void handleMaxSpeed(){
       if (this.itsSpeed > this.itsMaxSpeed){
           this.itsMaxSpeed = this.itsSpeed;
       }
    }

    // =============== Setters ===============

    public void setItsSpeed(int speed){
		this.itsSpeed = speed;
	}

    public void setItsMaxSpeed(int maxSpeed){
		this.itsMaxSpeed = maxSpeed;
	}

    public void setItsDirection(int direction){
		this.itsDirection = direction;
	}


    // =============== Getters ===============

    public int getItsSpeed(){
		return this.itsSpeed;
	}

    public int getItsMaxSpeed(){
		return this.itsMaxSpeed;
	}

    public int getItsDirection(){
		return this.itsDirection;
	}

}
