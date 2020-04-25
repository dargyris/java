class Text {

    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.println("Hello!\n");
        System.out.println("Just trying out some basic escape characters.\n");
        System.out.println("Seems that if I don't use the \"n\" character");
        System.out.println("but change the line __in the code__,");
        System.out.println("the line changes in the output as well.\n");
        System.out.println("Do I like this?...\n");
    }
}
