public class MethodOverloading {

    public MethodOverloading(){
        System.out.println( "\t~ Method Overloading ~\n" );
    }

    public void whatIs(){
        System.out.print( "\n\tProviding two or more separate methods ");
        System.out.print("in a class with the same name but different parameters. " );
        System.out.print( "The return type may or may not be different. This " );
        System.out.print( "allows us to reuse the same method name." );
        System.out.print( "\n\tOverloading is ver handy because it reduces " );
        System.out.print( "duplicated code and we don't have to remember multiple " );
        System.out.print( "method names." );
        System.out.print( "\n\tOverloading can be referred to as Compile Time " );
        System.out.print( "Polymorphism. In other words the compiler knows which " );
        System.out.print( "method to call based on the method name and argument " );
        System.out.print( "list." );
        System.out.print( "\n\tUsually overloading happens inside a single class, but " );
        System.out.print( "a method can also be treated as overloaded in a subclass of " );
        System.out.print( "that parent class. That is because a subclass inherits one " );
        System.out.print( "version of the method from the parent class and then the " );
        System.out.print( "subclass can have another overloaded version of the method." );
        System.out.println( "\n\n" );
    }

}
