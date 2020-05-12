public class PC {

    private Case itsEnclosure;
    private Monitor itsMonitor;
    private Motherboard itsMotherboard;

    // ========== Setter Contructor ==========

    public PC( Case enclosure,
               Monitor monitor,
               Motherboard motherboard){

    this.itsEnclosure = enclosure;
    this.itsMonitor = monitor;
    this.itsMotherboard = motherboard;

    }


    // =============== Setters ===============

    public void setItsEnclosure(Case enclosure){
		this.itsEnclosure = enclosure;
	}

    public void setItsMonitor(Monitor monitor){
		this.itsMonitor = monitor;
	}

    public void setItsMotherboard(Motherboard motherboard){
		this.itsMotherboard = motherboard;
	}


    // =============== Getters ===============

    public Case getItsEnclosure(){
		return this.itsEnclosure;
	}

    public Monitor getItsMonitor(){
		return this.itsMonitor;
	}

    public Motherboard getItsMotherboard(){
		return this.itsMotherboard;
	}


}
