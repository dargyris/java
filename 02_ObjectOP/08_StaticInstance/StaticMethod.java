class StaticMethod {

    public static void whatIs(){
        System.out.println( "\t~ Static Methods ~\n" );
        System.out.print( "\n\tStatic methods are declared using " 
                + "a static modifier. They can't access isntance " 
                + "methods or variables directly. They are used " 
                + "for operations not requiring any data from an " 
                + "instance of the class (this)." );
        System.out.print( "\n\tMain is a very good example of a " 
                + "static method. It doesn't use instance "
                + "variables. " );
        System.out.print( "\n\tMy method needs to be declared as "
                + "static. The class needs to NOT be public. Then "
                + "I don't need to create an object in Main to be " 
                + "able to call that method.");
        System.out.print( "\n\tMy main function in the Main class " 
                + "where all the magic happens, is declared as " 
                + "static as well. (In case we haven't noticed...)" );
        System.out.println( "\n" );
    }

}
