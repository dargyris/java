class BaseMeat extends Entity{

    public BaseMeat(){
        this((short)0);
    }

    public BaseMeat(short qty){
        this("B.T.O.\u2122 Base Meat\t", "Meat", 1.d, qty);
    }

    public BaseMeat( String name,
                     String type,
                     double price,
                     short qty){
        
        super(name, type, price, qty);
    }

//     Setters and Getters it inherits from super-class Entity
//     Also print functionality with the inherited printProperties();

}

class WhaleBlubber extends Entity{

    public WhaleBlubber(){
        this((short)0);
    }

    public WhaleBlubber(short qty){
        this("B.T.O.\u2122 Whale Blubber\t", "Meat", 2.5d, qty); 
    }

    public WhaleBlubber( String name,
                         String type,
                         double price,
                         short qty){
        
        super(name, type, price, qty);
    }

//     Setters and Getters it inherits from super-class Entity
//     Also print functionality with the inherited printProperties();

}

class NarwhalBacon extends Entity{

    public NarwhalBacon(){
        this((short)0);
    }

    public NarwhalBacon(short qty){
        this("Natura\u2122 Narwhal Bacon\t\t", "Meat", 4.d, qty);
    }

    public NarwhalBacon( String name,
                     String type,
                     double price,
                     short qty){
        
        super(name, type, price, qty);
    }

//     Setters and Getters it inherits from super-class Entity
//     Also print functionality with the inherited printProperties();

}

class PigBabies extends Entity{

    public PigBabies(){
        this((short)0);
    }

    public PigBabies(short qty){
        this("B.T.O.\u2122 New-born Pig Babies", "Meat", 5.5d, qty);
    }

    public PigBabies( String name,
                     String type,
                     double price,
                     short qty){
        
        super(name, type, price, qty);
    }

//     Setters and Getters it inherits from super-class Entity
//     Also print functionality with the inherited printProperties();

}

class EndangeredPenguin extends Entity{

    public EndangeredPenguin(){
        this((short)0);
    }

    public EndangeredPenguin(short qty){
        this("Natura\u2122 Endangered Penguin\t", "Meat", 5.5d, qty);
    }

    public EndangeredPenguin( String name,
                     String type,
                     double price,
                     short qty){
        
        super(name, type, price, qty);
    }

//     Setters and Getters it inherits from super-class Entity
//     Also print functionality with the inherited printProperties();

}
