class aChallenge{

    public static void main(String[] args){
        System.out.println("\033[H\033[2J");

        byte byteValue = 10;
        short shortValue = 20;
        int intValue = 50;

        long longTotal = 50_000L + 10L *
            (byteValue + shortValue + intValue);
        System.out.println("longTotal\t: " + longTotal + "\n");
    }
}
