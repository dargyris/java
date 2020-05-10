public class MethodOverriding {

    public MethodOverriding(){
        System.out.println( "\t~ Method Overriding ~\n" );
    }

    public void whatIs(){
        System.out.print( "\n\tIt means to define a method in a child ");
        System.out.print("class that already exists in the parent class with the " );
        System.out.print( "SAME signature(same name AND arguments). " );
        System.out.print( "\n\tThe methods inherited from the parent class " );
        System.out.print( "are called derived methods." );
        System.out.print( "\n\tMethod overriding is also known as Runtime " );
        System.out.print( "Polymorphism and Dynamic Method Dispach, because the " );
        System.out.print( "method that is going to be called is decided at " );
        System.out.print( "runtime by the JVM (Java Virtual Machine)." );
        System.out.print( "\n\tIt is considered a good practice to put \"@Override\" " );
        System.out.print( "immediately above the method definition when we are doing " );
        System.out.print( "method overriding. This functions as a hint to the compiler " );
        System.out.print( "of our intentions, and will then show us an error if we " );
        System.out.print( "don't follow overriding rules correctly." );
        System.out.println();
    }

}
