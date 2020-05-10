class ThisVsSuperParent {

    private int itsParentFirstVar;
    private int itsParentSecondVar;
    private int itsParentThirdVar;

    public ThisVsSuperParent(){
        this(40, 40, 40);
        System.out.println( "~ Empty (40 40 40) Parent Constructor ~" );
    }

    public ThisVsSuperParent(int parentFirstVar){
        this(parentFirstVar, 40, 40);
        System.out.println( "~ 40, 40 Parent Constructor ~" );
    }

    public ThisVsSuperParent(int parentFirstVar,
                             int parentSecondVar){
        this(parentFirstVar, parentSecondVar, 40);
        System.out.println( "~ 40 Parent Constructor ~" );
    }

    public ThisVsSuperParent( int parentFirstVar,
                            int parentSecondVar,
                            int parentThirdVar){
        this.itsParentFirstVar = parentFirstVar;
        this.itsParentSecondVar = parentSecondVar;
        this.itsParentThirdVar = parentThirdVar;
        System.out.println( "~ Parent Setter Constructor ~" );
    }

    public void printMethod(){
        System.out.println( "> Parent First Var\t: " + this.itsParentFirstVar );
        System.out.println( "> Parent Second Var\t: " + this.itsParentSecondVar );
        System.out.println( "> Parent Third Var\t: " + this.itsParentThirdVar );
    }

    public void setItsParentFirstVar(int parentFirstVar){
        this.itsParentFirstVar = parentFirstVar;
    }

    public void setItsParentSecondVar(int parentSecondVar){
        this.itsParentSecondVar = parentSecondVar;
    }

    public void setItsParentThirdVar(int parentThirdVar){
        this.itsParentThirdVar = parentThirdVar;
    }

    public int getItsParentFirstVar(){
        return this.itsParentFirstVar;
    }

    public int getItsParentSecondVar(){
        return this.itsParentSecondVar;
    }

    public int getItsParentThirdVar(){
        return this.itsParentThirdVar;
    }
}

class ThisVsSuperChild extends ThisVsSuperParent {

    private short itsChildFirstVar;
    private short itsChildSecondVar;
    private short itsChildThirdVar;

    public ThisVsSuperChild() {
 //       this((short)5, (short)5, (short)5);
 //       super.setItsParentFirstVar(5);
 //       super.setItsParentSecondVar(5);
 //       super.setItsParentThirdVar(5);
        super(5, 5, 5);
        this.setItsChildFirstVar((short)5);
        this.setItsChildSecondVar((short)5);
        this.setItsChildThirdVar((short)5);
        System.out.println( "\t~ Empty (5 5 5) Child Constructor ~" );
    }

    public ThisVsSuperChild( short childFirstVar){
        this(childFirstVar, (short)5, (short)5);
        System.out.println( "\t~ 5 5 Child Constructor ~" );
    }

    public ThisVsSuperChild( short childFirstVar,
                             short childSecondVar){
        this(childFirstVar, childSecondVar, (short)5);
        System.out.println( "\t~ 5 Child Constructor ~" );
    }

    public ThisVsSuperChild( short childFirstVar,
                             short childSecondVar,
                             short childThirdVar){

        this.itsChildFirstVar = childFirstVar;
        this.itsChildSecondVar = childSecondVar;
        this.itsChildThirdVar = childThirdVar;
        System.out.println( "\t~ Setter Child Constructor ~" );
    }
    
    @Override
    public void printMethod(){
        super.printMethod();
        System.out.println( "\t> Child First Var\t: " + this.itsChildFirstVar );
        System.out.println( "\t> Child Second Var\t: " + this.itsChildSecondVar );
        System.out.println( "\t> Child Third Var\t: " + this.itsChildThirdVar );
    }

    public void setItsChildFirstVar(short childFirstVar){
        this.itsChildFirstVar = childFirstVar;
    }

    public void setItsChildSecondVar(short childSecondVar){
        this.itsChildSecondVar = childSecondVar;
    }

    public void setItsChildThirdVar(short childThirdVar){
        this.itsChildThirdVar = childThirdVar;
    }

    public short getItsChildFirstVar(){
        return (short)this.itsChildFirstVar;
    }

    public short getItsChildSecondVar(){
        return (short)this.itsChildSecondVar;
    }

    public short getItsChildThirdVar(){
        return (short)this.itsChildThirdVar;
    }

}
