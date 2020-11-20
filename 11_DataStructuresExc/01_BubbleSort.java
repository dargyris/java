class BubbleSort {
    
    public static void main ( String[] args ){

        System.out.println( "BUBBLE SORT" );
        System.out.println( " * Mem: In-place: No copies of array." );
        System.out.println( "   Extra memory needed != f(number of sorted items)." );
        System.out.println( " * Quadratic t complexity: O of n ^2." );
        System.out.println( "   10 items -> 100 steps." );
        System.out.println( " * Degrades quickly." );
        System.out.println( "====================================================" );

        int[] evenIntArray = new int[4];
        int[] oddIntArray = new int[3];

        oddIntArray[0] = 4;
        oddIntArray[1] = 18;
        oddIntArray[2] = -29;

        printArray(oddIntArray);
        bubbleSort( oddIntArray );
        printArray( oddIntArray );

        evenIntArray[0] = 30;
        evenIntArray[1] = 100;
        evenIntArray[2] = -50;
        evenIntArray[3] = 80;

        printArray( evenIntArray );
        bubbleSort( evenIntArray );
        printArray( evenIntArray );

    }

    public static void bubbleSort ( int[] myArray ){
        
        for ( int lastUnsortedIndex = myArray.length - 1;
                lastUnsortedIndex > 0;
                lastUnsortedIndex-- ){

            for ( int i = 0; i < lastUnsortedIndex; i++ ){

                if ( myArray[i] > myArray[i+1] ){
                    swap( myArray, i, i+1 );
                }

            }
            
        }
    }

    public static void swap ( int[] myArray, int i, int j ){

        if( i==j ) return;

        int temp = myArray[i];
        myArray[i] = myArray[j];
        myArray[j] = temp;

    }

    public static void printArray ( int[] myArray ){

        decorateOutput( myArray );

        for ( int i=0; i<myArray.length; i++ ){
            System.out.printf( " %3d ", myArray[i] );
        }

        decorateOutput( myArray );

    }

    public static void decorateOutput ( int[] myArray ){

        System.out.println();

        for ( int i=0; 
                i< 5 * myArray.length + 1; 
                i++ ){
            System.out.printf( "-" );
        }

        System.out.println();

    }
}
