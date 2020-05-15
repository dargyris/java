class BaseMeat extends Entity{

    public BaseMeat(){
        this("Base Meat", "Meat", 1.d, (short)0);
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
        this("B.T.O.\u2122 Whale Blubber", "Meat", 2.5d, (short)0);
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
        this("Natura\u2122 Narwhal Bacon", "Meat", 4.d, (short)0);
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
        this("B.T.O.\u2122 New-born Pig Babies", "Meat", 5.5d, (short)0);
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
        this("Natura\u2122 Endangered Penguin", "Meat", 5.5d, (short)0);
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
