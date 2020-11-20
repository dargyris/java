class ShellSort {

    public static void main ( String[] args ){

        System.out.println( "SHELL SORT" );
        System.out.println( " * Insertion sort variant." );
        System.out.println( "   Insertion uses gap of 1." );
        System.out.println( "   Shell sort uses a decreasing gap starting from" );
        System.out.println( "   a larger value." );
        System.out.println( "   We want to reduce the amount of shifting required." );
        System.out.println( "   The gap used affects the time complexity." );
        System.out.println( "   Knuth sequence: (3 ^k - 1) / 2" );
        System.out.println( " * Can also improve Bubble sort, but -> Unstable." );
        System.out.println( " * In-place algo.: Extra mem doesn't depent on the" );
        System.out.println( "   number of items sorted." );
        System.out.println( " * WC: Quadratic." );
        System.out.println( " * UNSTABLE." );

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        printArray( intArray );
        
        for ( int gap = intArray.length / 2;
                gap > 0;
                gap /= 2 ){

            for ( int i = gap; i < intArray.length; i++ ){
                int newElement = intArray[i];

                int j = i;

                while ( j >= gap && intArray[j - gap] > newElement ){
                        intArray[j] = intArray[j - gap];
                        j -= gap;
                }

                intArray[j] = newElement;
            }

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
