// Abbreviating Operators

class Operators{
    public static void main(String[] args){
        System.out.print("\033[H\033[2J");

        int result = 1;

        // result = result + 1
        result++; // 1 + 1 = 2
        System.out.println("1 + 1 = " + result);

        // result = result - 1
        result--; // 2 - 1 = 1
        System.out.println("2 - 1 + " + result);

        // result = result + 2
        result += 2; // 1 + 2 = 3
        System.out.println("1 + 2 = " + result);

        // result = result * 10
        result *=10; // 3 * 10 = 30
        System.out.println("3 * 10 = " + result);

        // result = result / 3
        result /= 3; // 30 / 3 = 10
        System.out.println("30 / 3 = " + result);

        // result = result - 2
        result -= 2; // 10 - 2 = 18
        System.out.println("10 - 2 = " + result);


    }
}
