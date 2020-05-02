class Menu{

    public static int menu(){

        int threeTries = 3;
        int intChoice = -1;

        while( threeTries > 0 ) {
            
            System.out.print("\033[H\033[2J");
            switch ( threeTries ){
                case 3:
                    Decorator.decorator();
                    ListChoices.listChoices();
                    intChoice = Prompt.prompt( threeTries );
                    break;
                case 2:
                    Decorator.decorator();
                    ListChoices.listChoices();
                    intChoice = Prompt.prompt( threeTries );
                    break;
                case 1:
                    Decorator.decorator();
                    ListChoices.listChoices();
                    intChoice = Prompt.prompt( threeTries ); 
                    break;
                case 0:
                    Decorator.decorator();
                    Prompt.prompt( threeTries );
                    break;
            }
            
            if ( intChoice != -1 ){
                break;
            }
            threeTries --;
                
        }

        return intChoice;
    }

}
