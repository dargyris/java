class GoldenTouch extends Entity{

    public GoldenTouch(){
        this((short)0);
    }

    public GoldenTouch(short qty){
        this("Natura\u2122 Bread made with real Gold!", "Bread", 10.d, qty);
    }

    public GoldenTouch( String name,
                        String type,
                        double price,
                        short qty){
        
        super(name, type, price, qty);
    }

//     Setters and Getters it inherits from super-class Entity
//     Also print functionality with the inherited printProperties();

}


class AfricaSecret extends Entity{

    public AfricaSecret(){
        this((short)0);
    }

    public AfricaSecret(short qty){
        this("B.T.O.\u2122 Africa Secret\t", "Bread", 2.5d, qty);
    }

    public AfricaSecret( String name,
                    String type,
                    double price,
                    short qty){
        
        super(name, type, price, qty);
    }

//     Setters and Getters it inherits from super-class Entity
//     Also print functionality with the inherited printProperties();

}


class DiamondCrumbs extends Entity{

    public DiamondCrumbs(){
        this((short)0);
    }

    public DiamondCrumbs(short qty){
        this("Natura\u2122 Diamond Sprinkled Bread\t", "Bread", 4.d, qty);
    }

    public DiamondCrumbs( String name,
                       String type,
                       double price,
                       short qty){
        
        super(name, type, price, qty);
    }

//     Setters and Getters it inherits from super-class Entity
//     Also print functionality with the inherited printProperties();

}
