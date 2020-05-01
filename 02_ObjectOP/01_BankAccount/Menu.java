class Menu{

    public static int menu(){

        int threeTries = 0;
        int intChoice = -1;

        while( threeTries < 3 ) {
            
            System.out.print("\033[H\033[2J");
            switch ( threeTries ){
                case 0:
                    Decorator.decorator();
                    ListChoices.listChoices();
                    Prompt.prompt( threeTries );
                    intChoice = GetInput.getInput();
                    break;
                case 1:
                    Decorator.decorator();
                    ListChoices.listChoices();
                    Prompt.prompt( threeTries );
                    intChoice = GetInput.getInput();
                    break;
                case 2:
                    Decorator.decorator();
                    ListChoices.listChoices();
                    Prompt.prompt( threeTries );
                    intChoice = GetInput.getInput();
                    break;
                case 3:
                    Decorator.decorator();
                    Prompt.prompt( threeTries );
                    break;
            }
            
            if ( intChoice != -1 ){
                break;
            }
            threeTries ++;
                
        }

        return intChoice;
    }

}
