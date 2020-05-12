public class Vehicle {

    private String itsName;
    private int itsNumber;
    private int itsOtherNumber;
    private short itsDick;
    private long itsPussy;
    private boolean itsPoolean;

    // =============== Getters ===============

    public Vehicle( String name,
                    int number,
                    int otherNumber,
                    short dick,
                    long pussy,
                    boolean poolean){

    this.itsName = name;
    this.itsNumber = number;
    this.itsOtherNumber = otherNumber;
    this.itsDick = dick;
    this.itsPussy = pussy;
    this.itsPoolean = poolean;

    }


    // =============== Setters ===============

    public void setItsName(String name){
		this.itsName = name;
	}

    public void setItsNumber(int number){
		this.itsNumber = number;
	}

    public void setItsOtherNumber(int otherNumber){
		this.itsOtherNumber = otherNumber;
	}

    public void setItsDick(short dick){
		this.itsDick = dick;
	}

    public void setItsPussy(long pussy){
		this.itsPussy = pussy;
	}

    public void setItsPoolean(boolean poolean){
		this.itsPoolean = poolean;
	}


    // =============== Getters ===============

    public String getItsName(){
		return this.itsName;
	}

    public int getItsNumber(){
		return this.itsNumber;
	}

    public int getItsOtherNumber(){
		return this.itsOtherNumber;
	}

    public short getItsDick(){
		return this.itsDick;
	}

    public long getItsPussy(){
		return this.itsPussy;
	}

    public boolean getItsPoolean(){
		return this.itsPoolean;
	}


}
