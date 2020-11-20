class InsertionSort {

    public static void main ( String[] args ){

        System.out.println( "INSERTION SORT" );
        System.out.println( " * In each iteration it picks off the first element" );
        System.out.println( "   in the unsorted partition and inserts it in the correct" );
        System.out.println( "   position in the sorted partition." );
        System.out.println( " * In-place algo.: Extra mem doesn't depent on the" );
        System.out.println( "   number of items sorted." );
        System.out.println( " * Quadratic." );
        System.out.println( " * Stable." );

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        printArray( intArray );
        
        for ( int firstUnsortedIndex = 1; 
                firstUnsortedIndex < intArray.length;
                firstUnsortedIndex++ ){

            int tempElement = intArray[firstUnsortedIndex];

            int i;
            for ( i = firstUnsortedIndex; 
                    i>0 && intArray[i-1] > tempElement;
                    i-- ){
                intArray[i] = intArray[i-1];
            }
            intArray[i] = tempElement;

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
}
