public class Main {

    public static void main ( String[] args ){

        System.out.print("\033[H\033[2J");

        OverridingParent.staticMethod();
        OverridingParent overridingParentInstance = new OverridingParent();
        overridingParentInstance.instanceMethod();
        System.out.println();

        OverridingChild.staticMethod();
        OverridingChild overridingChildInstance = new OverridingChild();
        overridingChildInstance.instanceMethod();
        System.out.println();

        OverloadingChild.staticMethod();
        OverloadingChild overloadingChildInstance = new OverloadingChild();
        overloadingChildInstance.instanceMethod();
    }

}
