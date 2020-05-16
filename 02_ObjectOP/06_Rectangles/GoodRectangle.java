public class GoodRectangle {

    private int itsX;
    private int itsY;
    private int itsWidth;
    private int itsHeight;

    public GoodRectangle(){           
        this(0, 0);         // Calls 2nd constructor
    }

    public GoodRectangle( int width,  
                         int height){
        this(0, 0, width, height);  // Calls 3rd constructor
    }

    public GoodRectangle( int x,
                         int y,
                         int width,
                         int height){
        this.itsX = x;
        this.itsY = y;
        this.itsWidth = width;
        this.itsHeight = height;
    }

}
