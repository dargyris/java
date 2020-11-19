class SelectionSort{
    
    public static void main ( String[] args ){

        System.out.println( "SELECTION SORT" );
        System.out.println( " * In each traversal, the largest Element is selected" );
        System.out.println( "   and moved as last element of the unsorted partition." );
        System.out.println( " * In-place algorithm: does not use extra memory." );
        System.out.println( " * Quadratic t algorithm." );
        System.out.println( "   For each element we traverse n elements." );
        System.out.println( " * Requires less swapping than bubble sort." );
        System.out.println( "   We only swap once per traversal." );
        System.out.println( " * Unstable algorithm." );
        System.out.println();

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        printArray( intArray );

        for ( int lastUnsortedIndex = intArray.length-1;    // Loop grows the sorted
                lastUnsortedIndex > 0;                      // partition by 1 from 
                lastUnsortedIndex-- ){                      // right to left

            int largestIndex = 0;
            for ( int i=1; i<=lastUnsortedIndex; i++ ){
                if ( intArray[i] > intArray[largestIndex] ){
                    largestIndex = i;
                }
            }
            swap( intArray, largestIndex, lastUnsortedIndex );
            
        }

        printArray( intArray );

    }

    public static void printArray ( int[] myArr ){
        System.out.printf( "\n====================================\n" );
        for ( int i=0; i<myArr.length; i++ ){
            System.out.printf( " %3d ", myArr[i] );
        }
        System.out.printf( "\n====================================\n" );
    }

    public static void swap ( int[] array, int i, int j ){
        if ( i==j ) return;
        
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
