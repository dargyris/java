import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main ( String[] args ){

        System.out.print("\033[H\033[2J");

        System.out.print( "Enter choice > " );
        Scanner scanner = new Scanner( System.in );
        String choice = scanner.nextLine();
        switch(choice) {
            case "Parent":
                ThisVsSuperParent firstParentInstance = new ThisVsSuperParent();
                firstParentInstance.printMethod();
                System.out.println();

                ThisVsSuperParent secondParentInstance = new ThisVsSuperParent(60);
                secondParentInstance.printMethod();
                System.out.println();

                ThisVsSuperParent thirdParentInstance = new ThisVsSuperParent(60, 60);
                thirdParentInstance.printMethod();
                System.out.println();

                ThisVsSuperParent fourthParentInstance = new ThisVsSuperParent(60, 60, 60);
                fourthParentInstance.printMethod();
                System.out.println();
                break;
            case "Child":
                ThisVsSuperChild firstChildInstance = new ThisVsSuperChild();
                firstChildInstance.printMethod();
                System.out.println();

                ThisVsSuperChild secondChildInstance = new ThisVsSuperChild((short)10);
                secondChildInstance.printMethod();
                System.out.println();

                ThisVsSuperChild thirdChildInstance = new ThisVsSuperChild((short)10, (short)10);
                thirdChildInstance.printMethod();
                System.out.println();

                ThisVsSuperChild fourthChildInstance = new ThisVsSuperChild((short)10, (short)10, (short)10);
                fourthChildInstance.printMethod();
                System.out.println();
                break;
            default: 
                System.out.println( "Bad choice." );
                break;
        }


    }

}
