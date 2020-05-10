class InstanceMethod {

    public static void whatIs(){
        System.out.println( "\t~ Instance Methods ~\n" );
        System.out.println( "\tDEMAND object creation. new.\n" );
        System.out.print( "\n\tInstance methods belong to a " 
                + "a specific instance of a class. This means that "
                + "to use an instance method we need to first " 
                + "INSTANTIATE the class using the \"new\" keyword. " );
        System.out.print( "\n\tInstance methods can access instance "
                + "methods and variables directly. Also they can "
                + "access static variables and static methods directly." );
        System.out.print( "\n\tMy method doesn't need to be declared as "
                + "static." );
        System.out.println( "\n" );
    }

}
