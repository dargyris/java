public class Fish extends Animal {

    private int itsGills;
    private int itsEyes;
    private int itsFins;

    public Fish( String name,
//                 int brain,
//                 int body,
                 int size,
                 int weight,

                 int gills,
                 int eyes,
                 int fins){

        super(name, 1, 1, size, weight);
        
        this.itsGills = gills;
        this.itsEyes = eyes;
        this.itsFins = fins;
    }

    private void rest(){
        System.out.println( "\t\tFish resting." );
    }

    private void moveMuscles(){
        System.out.println( "\t\tMoves muscles." );
    }

    private void moveBackFin(){
        System.out.println( "\t\tMoves back fin." );
    }

    public void swim(int speed){
        moveMuscles();
        moveBackFin();
        System.out.println( "\t\tFish swimming." );
        super.move(speed);
    }


}
