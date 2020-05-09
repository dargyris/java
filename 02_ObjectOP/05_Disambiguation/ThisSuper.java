public class ThisSuper {

    public void whatSuperDoes(){
        System.out.println( "To access/call the parent class members, variables and methods." );
        System.out.println( "When I am defining a function that has the same name" );
        System.out.println( "as another function belonging to the parent class." );

        System.out.println( "\nThe only way to call a parent constructor is with super()." );
    }

    public void whatThisDoes(){
        System.out.println( "Call current class members, variables and methods." );
        System.out.println( "Required when I am using parameters with the same name" ); 
        System.out.println( "as instance variables." );
        System.out.println( "For demonstration purposes for instances I am using the" );
        System.out.println( "prefix \"its\" for its Vars." );
        System.out.println( "I can use both in a class except in static areas." );
        System.out.println( "This is used with setters and optionally with getters." );
        
        System.out.println( "\nWe use this() to call a constructor from another" );
        System.out.println( "overloaded constructor in the same class." );
    }

}
