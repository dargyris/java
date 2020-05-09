public class House {

    private String itsColor;

    public House( String color ){
        this.itsColor = color;
        System.out.println( "House constructor called!" );
    }

    public String getItsColor(){
        return this.itsColor;
    }

    public void setItsColor(String color){
        this.itsColor = color;
    }
}
