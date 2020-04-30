// Not knowing how many loops I need ahead of time.

class WhileLoop{

    public static void main ( String[] args ){

        System.out.print("\033[H\033[2J");
        
        System.out.println( "While with condition" );
        int count = 1;
        while( count != 6 ){
            System.out.println( "Count value is: " + count );
            count++;
        }
        
        System.out.println( "\nWhile ( true )" ); 
        count = 1; 
        while( true ){
            if( count == 6 ){
                break;
            }
            System.out.println( "Count value is: " + count );
            count++;
        }

    }

}
