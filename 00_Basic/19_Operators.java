class Operators{
    public static void main(String[] args){
        System.out.print("\033[H\033[2J");

        int result = 1 + 2; // 1 + 2 = 3
        System.out.println("1 + 2: " + result);
        
        int previousResult = result;
        System.out.println("previousResult: " + previousResult);
        result = result - 1;        // 3 - 1 = 2
        System.out.println("3 - 1: " + result);
        System.out.println("previousResult: " + previousResult);

        result = result * 10;   // 2 * 10 = 20
        System.out.println("2 * 10: " + result);

        result = result / 5; // 20 / 5 = 4
        System.out.println("20 / 5: " + result);
    
        result = result % 3; // the remainder of (4 % 3) = 1
        System.out.println("4 % 3: " + result);

    }
}
