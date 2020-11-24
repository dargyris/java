public class Main {
    public static void main(String[] args) {

        int[] intArray = new int[10];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = i;
        }

        ArrayImplementation.printIntArray(intArray);
        intArray = ArrayImplementation.addToArray(intArray, 100);
        ArrayImplementation.printIntArray(intArray);
    }
}

