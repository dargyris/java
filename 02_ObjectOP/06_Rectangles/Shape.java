class Shape {

    private int itsX;
    private int itsY;

    public Shape(int x, int y){
        this.itsX = x;
        this.itsY = y;
    }

}

class Rectangle extends Shape {

    private int itsWidth;
    private int itsHeight;

    // 1st constructor
    public Rectangle(int x, int y){
        this(x, y, 0, 0); // calls 2nd constructor
    }

    // 2nd constructor
    public Rectangle(int x, int y, int width, int height){
        super(x, y); // calls parent constructor
        this.itsWidth = width;
        this.itsHeight = height;
    }

}
