public class OverridingDemo {

    public void write(){
        System.out.println( "> I am writing..." );
    }

}

class Overrider extends OverridingDemo{

    @Override
    public void write(){
        System.out.println( "\t> I am over-writing!" );
    }

}

class NonOverrider extends OverridingDemo {

    public void write(int reps){
        for(int i = 0; i < reps; i++){
            System.out.println( "\t> I, am NOT overriding!" );
        }
    }

}
