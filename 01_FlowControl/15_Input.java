import java.io.IOException;
import java.util.Scanner;

class Input{

    public static void main ( String[] args ){

        System.out.print("\033[H\033[2J");
        Scanner scanner = new Scanner( System.in );
        System.out.println( "Enter your year of birth." );

        boolean hasNextInt = scanner.hasNextInt();

        if( hasNextInt ){

            int yearOfBirth = scanner.nextInt();
            scanner.nextLine(); // Handle next line character ( enter key )
            
            System.out.println( "Enter your name: " );
            String name = scanner.nextLine(  );
            
            int age = 2020 - yearOfBirth;
            if( age >= 0 && age <= 100 ){
                System.out.println( "Your name is: " + name + 
                    ", and you are " + age + " years old.");
            } else {
                System.out.println( "Invalid year of birth." );
            }
            
        } else {
            System.out.println( "Unable to parse year of birth." );
        }

        scanner.close(  );

    }

}
