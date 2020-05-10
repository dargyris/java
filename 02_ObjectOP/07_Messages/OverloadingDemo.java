public class OverloadingDemo {

    public void talk(){
        System.out.println( "> I am talking..." );
    }

    public void talk(int time){
        for(int i = 0; i < time; i++){
            System.out.println( "\t> I am talking." );
        }
    }

}
