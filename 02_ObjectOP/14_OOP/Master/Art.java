import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Art {

    private short choice;

    public Art(){
        
    }

    public void printArt(short choice){
        System.out.println( "\033[H\033[2J" );
        switch (choice){
            case 0:
                logo();
                break;
            case 1:
                burger();
                break;
            case 2:
                burger();
                break;
            case 3:
                serving();
                break;
            default:
                System.out.println( "Panic!" );
                break;
        }
    }

    public void wait(short time){
        System.out.println( "\t" );
        try {
            System.out.print( "\t" );
            for( int i = 0; i < 26; i++ ){
                System.out.print( ">" );
                TimeUnit.MILLISECONDS.sleep(time);
            }
        } catch ( InterruptedException e){
            e.printStackTrace();
        }
    }

    public void interact(){
        try {
            int waitKey = System.in.read();
        }catch( IOException e){
            System.out.println( "Error reading from the user." );
        }
    }

    public void logo(){
        System.out.println( "\t          |                           " ); 
        System.out.println( "\t        \\ _ /                        " ); 
        System.out.println( "\t      -= (_) =-                       " ); 
        System.out.println( "\t        /   \\         _\\/_          " ); 
        System.out.println( "\t          |           //o\\  _\\/_    " ); 
        System.out.println( "\t   _____ _ __ __ ____ _ | __/o\\\\ _  " ); 
        System.out.println( "\t =-=-_-__=_-= _=_=-=_,-'|\"'\"\"-|-,_ " ); 
        System.out.println( "\t  =- _=-=- -_=-=_,-\"         |       " ); 
        System.out.println( "\t    =- =- -=.--\"                     " ); 
    }

    public void burger(){
        System.out.println( "\t                        " ); 
        System.out.println( "\t                        " ); 
        System.out.println( "\t                        " ); 
        System.out.println( "\t        _..----.._      " ); 
        System.out.println( "\t      .'     o    '.    " ); 
        System.out.println( "\t     /   o       o  \\   " ); 
        System.out.println( "\t    |o        o     o|  " ); 
        System.out.println( "\t    /'-.._o     __.-'\\  " ); 
        System.out.println( "\t    \\      `````     /  " ); 
        System.out.println( "\t    |``--........--'`|  " ); 
        System.out.println( "\t     \\              /   " ); 
        System.out.println( "\t      `'----------'`    " ); 
        System.out.println( "\t                        " ); 
    }

    public void deluxe(){
        System.out.println( "\t       __                        " ); 
        System.out.println( "\t      /                           " ); 
        System.out.println( "\t   .-/-.                          " ); 
        System.out.println( "\t   |'-'|                          " ); 
        System.out.println( "\t   |   |                          " ); 
        System.out.println( "\t   |   |   .-\"\"\"\"-.           " ); 
        System.out.println( "\t   \\___/  /' .  '. \\   \\|/\\// " ); 
        System.out.println( "\t         (`-..:...-')  |`\"\"`|   " ); 
        System.out.println( "\t          ;-......-;   |    |     " ); 
        System.out.println( "\t           '------'    \\____/    " ); 
        System.out.println( "\t                                  " ); 
        System.out.println( "\t                                  " ); 
    }

    public void serving(){
        System.out.println( "\t                               " ); 
        System.out.println( "\t  	                          " ); 
        System.out.println( "\t                               " ); 
        System.out.println( "\t      %%%%                     " ); 
        System.out.println( "\t     %%% ,                     " ); 
        System.out.println( "\t    %%%6 `                     " ); 
        System.out.println( "\t    %%%   <                    " ); 
        System.out.println( "\t    %%% )(           __o       " ); 
        System.out.println( "\t    %%%_  \\      _/  \\ /     " ); 
        System.out.println( "\t    |_\\    )   _| |__ Y__     " ); 
        System.out.println( "\t     \\ \\__/..<' |_|  ---/    " ); 
        System.out.println( "\t      \\_..--<__________/      " ); 
        System.out.println( "\t       )==0                    " ); 
        System.out.println( "\t     #######                   " ); 
        System.out.println( "\t    ########                   " ); 
        System.out.println( "\t     #######                   " ); 
        System.out.println( "\t      \\   ||                  " ); 
        System.out.println( "\t       \\  ||                  " ); 
        System.out.println( "\t       /  //                   " ); 
        System.out.println( "\t      (  ||                    " ); 
        System.out.println( "\t       \\ ||                   " ); 
        System.out.println( "\t        )||                    " ); 
        System.out.println( "\t        |\\\\                  " ); 
        System.out.println( "\t________V\\\\\\______________  " ); 
        System.out.println( "\t                               " );
    }				      
}    
