public class Car extends Vehicle {

    private int itsDoors;
    private int itsEngineCapacity;

    // ========== Setter Contructor ==========

    public Car( String name,

                int doors,
                int engineCapacity){
    super(name);
    this.itsDoors = doors;
    this.itsEngineCapacity = engineCapacity;

    }


    // =============== Setters ===============

    public void setItsDoors(int doors){
		this.itsDoors = doors;
	}

    public void setItsEngineCapacity(int engineCapacity){
		this.itsEngineCapacity = engineCapacity;
	}


    // =============== Getters ===============

    public int getItsDoors(){
		return this.itsDoors;
	}

    public int getItsEngineCapacity(){
		return this.itsEngineCapacity;
	}




}
