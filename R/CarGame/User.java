import java.io.IOException;
import java.util.Scanner;

public class User {

    private String itsName;
    private int itsMaxSpeed;

    // ========== Setter Contructor ==========

    public User(){
        this("Null", 0);
    }

    public User( String name,
                 int maxSpeed){

    	this.itsName = name;
    	this.itsMaxSpeed = maxSpeed;

    }

    // =======================================

    public void setItsName(){
        String name;
        System.out.print( "\n\tPlease enter your name > " );
        Scanner theScanner = new Scanner(System.in);
        name = theScanner.nextLine();
        this.itsName = name;
    }

    // =============== Setters ===============

    public void setItsName(String name){
		this.itsName = name;
	}

    public void setItsMaxSpeed(int maxSpeed){
		this.itsMaxSpeed = maxSpeed;
	}


    // =============== Getters ===============

    public String getItsName(){
		return this.itsName;
	}

    public int getItsMaxSpeed(){
		return this.itsMaxSpeed;
	}



}
