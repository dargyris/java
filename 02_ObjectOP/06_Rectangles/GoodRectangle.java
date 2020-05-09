public class GoodRectangle {

    private int itsX;
    private int itsY;
    private int itsWidth;
    private int itsHeight;

    public GoodRectangle(){           // Calls 2nd constructor
        this(0, 0);
    }

    public GoodRectangle( int width,  // Calls 3rd constructor
                         int height){
        this(0, 0, width, height);
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
