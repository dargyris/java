class Arrays{
    public static void main ( String[] args ){

        System.out.println( "ARRAYS" );
        System.out.println( " * Contiguous chunk of memory." );
        System.out.println( " * Every Element SAME amount of space." );
        System.out.println( " * For Object references." );
        System.out.println( " * Element: startAddress + numOfElements * size." );
        System.out.println( " * Known index retrieval: O(1): constant t complexity." );
        System.out.println( " * Unknown index (WCC): O(n): Linear." );
        System.out.println( "========================================================" );
        System.out.println();

        int[] intArray = {5, -26, 78, 3, 5, 89, -35, 48, 2, 25};
        printArray( intArray );

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
        for ( int i=0; i<5*myArray.length + 1; i++ ){
            System.out.printf( "-" );
        }
        System.out.println();
    }
}
