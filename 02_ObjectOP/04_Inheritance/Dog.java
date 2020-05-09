public class Dog extends Animal {

    private int itsEyes;
    private int itsLegs;
    private int itsTail;
    private int itsTeeth;
    private String itsCoat;

    public Dog( String name,
                // int itsBrain,
                // int itsBody,
                int size,
                int weight,

                int eyes,
                int legs,
                int tail,
                int teeth,
                String coat){
        
        super(name, 1, 1, size, weight);
        this.itsEyes = eyes;
        this.itsLegs = legs;
        this.itsTail = tail;
        this.itsTeeth = teeth;
        this.itsCoat = coat;

    }
    
    private void moveLegs(int speed){
        System.out.println( "\tDog moves its legs!" );
    }

    @Override
    public void move(int speed){
        System.out.println( "\tDog moves!" );
        moveLegs(speed);
        super.move(speed);
    }

    private void chew(){
        System.out.println( "\tDog's chewing..." );
    }
    
    @Override
    public void eat(){
        System.out.println( "\tDog's eating..." );
        chew();
    }

    public void walk(){
        System.out.println( "\tDog walks!" );
        move(5);
    }

    public void run(){
        System.out.println( "\tDog runs!" );
        move(10);
    }

}
