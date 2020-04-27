class CharDemo{
    public static void main(String[] args){
        System.out.print("\033[H\033[2J");
    
        char myChar = 'D';
        char myUnicodeChar ='\u0044';
        System.out.println("Char\t: " + myChar);
        System.out.println("Unicode\t: " + myUnicodeChar + "\n");

        System.out.println("String -> Int");
        System.out.println("Char to Int\t: " + (int)myChar);
        System.out.println("Unicode to Int\t: " + (int)myUnicodeChar + "\n");

        System.out.println("Copyright in Unicode: 00A9 -> " + '\u00A9');
    }
} 
