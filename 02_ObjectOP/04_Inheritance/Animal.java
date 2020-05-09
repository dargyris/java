public class Animal {

    private String itsName;
    private int itsBrain;
    private int itsBody;
    private int itsSize;
    private int itsWeight;

    public Animal( String name,
                   int brain,
                   int body,
                   int size,
                   int weight){

        this.itsName = name;
        this.itsBrain = brain;
        this.itsBody = body;
        this.itsSize = size;
        this.itsWeight = weight;

    }

    public void eat(){
       System.out.println( "The Animal is eating!" ); 
    }

    public void move(int speed){
        System.out.println( "The Animal is moving at " + speed + " m/s.");
    }

    public String getItsName(){
        return this.itsName;
    }

    public int getItsBrain(){
        return this.itsBrain;
    }

    public int getItsBody(){
        return this.itsBody;
    }

    public int getItsSize(){
        return this.itsSize;
    }

    public int getItsWeight(){
        return this.itsWeight;
    }

    public void setItsName(String name){
        this.itsName = name;
    }

    public void setItsBrain(int brain){
        this.itsBrain = brain;
    }

    public void setItsBody(int body){
        this.itsBody = body;
    }

    public void setItsSize(int size){
        this.itsSize = size;
    }

    public void setItsWeight(int weight){
        this.itsWeight = weight;
    }

}
