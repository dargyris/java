public class Main {

    public static void main ( String[] args ){

        System.out.print("\033[H\033[2J");

        MethodOverloading methodOverloading = new MethodOverloading();
        methodOverloading.whatIs();
        
        MethodOverriding methodOverriding = new MethodOverriding();
        methodOverriding.whatIs();

        OverloadingDemo overloadingDemo = new OverloadingDemo();
        overloadingDemo.talk();
        overloadingDemo.talk(2);

        OverridingDemo overridingDemo = new OverridingDemo();
        overridingDemo.write();

        Overrider overrider = new Overrider();
        overrider.write();

        NonOverrider nonOverrider = new NonOverrider();
        nonOverrider.write(3);

    }

}
