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

    // =======================================

    public void powerUp(){
        // getItsEnclosure.pressPowerButton();
        itsEnclosure.pressPowerButton();
        drawLogo();
    }

    private void drawLogo(){
        getItsMonitor().drawPixelAt(1200, 50, "yellow");
        // or access directly with the variable "monitor"
        // monitor.drawPixelAt(1200, 50, "yellow");
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

    private Case getItsEnclosure(){
		return this.itsEnclosure;
	}

    private Monitor getItsMonitor(){
		return this.itsMonitor;
	}

    private Motherboard getItsMotherboard(){
		return this.itsMotherboard;
	}


}
