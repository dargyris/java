import java.io.IOException;
import java.util.Scanner;

class Input{

    public static void main ( String[] args ){

        System.out.print("\033[H\033[2J");

        Scanner scanner = new Scanner( System.in );

        System.out.println( "Enter your year of birth." );
        int yearOfBirth = scanner.nextInt();
        scanner.nextLine(); // Handle next line character ( enter key )
        
        System.out.println( "Enter your name: " );
        String name = scanner.nextLine(  );
        
        int age = 2020 - yearOfBirth;
        System.out.println( "Your name is: " + name + ", and you are " + age + " years old.");
        scanner.close(  );

    }

}
