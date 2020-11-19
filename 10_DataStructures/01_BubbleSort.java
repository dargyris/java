class BubbleSort {

    public static void main ( String[] args ){
        
        System.out.println( "BUBBLE SORT" );
        System.out.println( " * In-place algorithm: Logical partition of same array.");
        System.out.println( " * Memory: In place algorithm" );
        System.out.println( "   The extra memory needed != f(number of items sorted)." );
        System.out.println( " * Quadratic t complexity: O of n ^2." );
        System.out.println( " * 100 steps to sort 10 items." );
        System.out.println( " * Algorithm degrades quickly." );
        System.out.println();

        int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };

        printArray( intArray );

        for ( int lastUnsortedIndex = intArray.length - 1;  // 1st for: n steps
                lastUnsortedIndex > 0;
                lastUnsortedIndex-- ){
            for ( int i=0; i<lastUnsortedIndex; i++ ){      // 2nd for: ~n steps
                if ( intArray[i] > intArray[i+1] ){
                    swap( intArray, i, i+1 );
                }
            }
        }
        printArray( intArray );
    }

    public static void printArray ( int[] myArr ){
        System.out.printf( "\n===================================\n" );
        for ( int i=0; i<myArr.length; i++ ){
            System.out.printf( " %3d ", myArr[i] );
        }
        System.out.println();
        System.out.printf( "===================================\n" );
    }

    public static void swap ( int[] array, int i, int j ){
        if ( i==j ) return;

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

}
