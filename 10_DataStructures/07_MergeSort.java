class MergeSort {

    public static void main ( String[] args ){

        System.out.println( "MERGE SORT" );
        System.out.println( " * Divide and conquer algo.: Splitting and merging." );
        System.out.println( " * First split 1/2: Left Right until 1-Element arrays." );
        System.out.println( " * Merge each L-R pair into a sorted array." );
        System.out.println( " * NOT in-place: Only Merging uses temporary arrays." );
        System.out.println( " * WC: n logn, base 2: Repeated division of array." );
        System.out.println( " * Stable." );

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        printArray( intArray );
        
        mergeSort( intArray, 0, intArray.length );

        printArray( intArray );

    }

    public static void printArray ( int[] myArr ){
        System.out.printf( "\n====================================\n" );
        for ( int i=0; i<myArr.length; i++ ){
            System.out.printf( " %3d ", myArr[i] );
        }
        System.out.printf( "\n====================================\n" );
    }

    public static void mergeSort ( int[] input, int start, int end ){
        if ( end - start < 2 ){     // Base condition
            return;
        }

        int mid = ( start + end ) / 2;
        mergeSort( input, start, mid );
        mergeSort( input, mid, end );
        merge( input, start, mid, end );

    }

    public static void merge ( int[] input, int start, int mid, int end ){

        if ( input[mid-1] <= input[mid] ) return;
        
        int i = start;
        int j = mid;
        int tempIndex = 0;

        int[] temp = new int[end - start];
        while ( i < mid && j < end ){
            temp[tempIndex++] = input[i] <= input[j] 
                ? input[i++] 
                : input[j++];
        }

        System.arraycopy( input, i, input, start + tempIndex, mid - i );
        System.arraycopy( temp, 0, input, start, tempIndex );
    }

}
