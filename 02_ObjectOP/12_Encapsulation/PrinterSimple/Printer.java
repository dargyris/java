public class Printer {

    private int itsTonerLevel;
    private int itsPagesPrinted;
    private boolean isDuplex;

    public Printer( int tonerLevel, boolean duplex){
        if(tonerLevel > -1 && tonerLevel <= 100){
            this.itsTonerLevel = tonerLevel;
        } else {
            this.itsTonerLevel = -1;
        }
        this.isDuplex = duplex;
        this.itsPagesPrinted = 0;
    }

    public int addToner(int tonerAmount) {
        if(tonerAmount > 0 && tonerAmount <= 100){
            if(this.itsTonerLevel + tonerAmount > 100){
                return -1;
            }
            this.itsTonerLevel += tonerAmount;
            return this.itsTonerLevel;
        } else {
            return -1;
        }
    }

    public int printPages(int pages){
        int pagesToPrint = pages;
        if(this.isDuplex) {
            pagesToPrint = (pages/2) + (pages % 2);
            System.out.println( "Duplex." );
        }
        this.itsPagesPrinted += pagesToPrint;
        return pagesToPrint;
    }

    public int getItsPagesPrinted(){
        return this.itsPagesPrinted;
    }

}
