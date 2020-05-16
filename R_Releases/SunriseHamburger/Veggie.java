class RhinoBV extends Entity{

    public RhinoBV(){
        this((short)0);
    }

    public RhinoBV(short qty){
        this("B.T.O.\u2122 Baby Rhino Rare Greens", "Vegetable", 2.5d, qty);
    }

    public RhinoBV( String name,
                    String type,
                    double price,
                    short qty){
        
        super(name, type, price, qty);
    }

//     Setters and Getters it inherits from super-class Entity
//     Also print functionality with the inherited printProperties();

}

class SpaceAlgae extends Entity{

    public SpaceAlgae(){
        this((short)0);
    }

    public SpaceAlgae(short qty){
        this("Natura\u2122 Space Algae\t\t", "Vegetable", 4.d, qty);
    }

    public SpaceAlgae( String name,
                       String type,
                       double price,
                       short qty){
        
        super(name, type, price, qty);
    }

//     Setters and Getters it inherits from super-class Entity
//     Also print functionality with the inherited printProperties();

}

class SeahorseUF extends Entity{

    public SeahorseUF(){
        this((short)0);
    }

    public SeahorseUF(short qty){
        this("Natura\u2122 Seahorse Unique Food\t", "Vegetable", 5.5d, qty);
    }

    public SeahorseUF( String name,
                      String type,
                      double price,
                      short qty){
        
        super(name, type, price, qty);
    }

//     Setters and Getters it inherits from super-class Entity
//     Also print functionality with the inherited printProperties();

}

class BlinkingSC extends Entity{

    public BlinkingSC(){
        this((short)0);
    }

    public BlinkingSC(short qty){
        this("B.T.O.\u2122 Blinking Sea-carrot", "Vegetable", 9.d, qty);
    }

    public BlinkingSC( String name,
                     String type,
                     double price,
                     short qty){
        
        super(name, type, price, qty);
    }

//     Setters and Getters it inherits from super-class Entity
//     Also print functionality with the inherited printProperties();

}

class FishermanLB extends Entity{

    public FishermanLB(){
        this((short)0);
    }

    public FishermanLB(short qty){
        this("Natura\u2122 Fisherman's Last Breath\t", "Vegetable", 10.d, qty);
    }

    public FishermanLB( String name,
                        String type,
                        double price,
                        short qty){
        
        super(name, type, price, qty);
    }

//     Setters and Getters it inherits from super-class Entity
//     Also print functionality with the inherited printProperties();
}
