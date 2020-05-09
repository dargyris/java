public class BadRectangle {

    private int itsX;
    private int itsY;
    private int itsWidth;
    private int itsHeight;

    public BadRectangle(){
        this.itsX = 0;
        this.itsY = 0;
        this.itsWidth = 0; // Initializes its width and height to 0.
        this.itsHeight = 0;
    }

    public BadRectangle( int width,
                         int height){
        this.itsX = 0;
        this.itsY = 0;
        this.itsWidth = width;
        this.itsHeight = height;
    }

    public BadRectangle( int x,
                         int y,
                         int width,
                         int height){
        this.itsX = x;
        this.itsY = y;
        this.itsWidth = width;
        this.itsHeight = height;
    }

}
