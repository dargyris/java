class OverridingParent {

    public static void staticMethod(){
        System.out.println( "> Overriding Parent: Static method." );
    }

    public OverridingParent(){
        System.out.println( "~ Overriding Parent Constructor ~" );
    }

    public void instanceMethod(){
        System.out.println( "> Overriding Parent: Instance method." );
    }


}

class OverridingChild extends OverridingParent {

    public static void staticMethod(){
        System.out.println( "\t> Overriding Child: Static Method." );
    }

    public OverridingChild(){
        System.out.println( "\t~ Overriding Child Constructor ~" );
    }

    @Override
    public void instanceMethod(){
        System.out.println( "\t> Overriding Child: Instance method." );
    }


}

class OverloadingChild extends OverridingParent{

    public static void staticMethod(){
        System.out.println( "Overloading Child: Static Method." );
    }

    public OverloadingChild(){
        System.out.println( "\t~ Overloading Child Constructor ~" );
    }

    public void instanceMethod(){
        System.out.println( "Overloading Child: Instance Method." );
    }


}
