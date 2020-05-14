class Movie {

    public String itsName;

    public Movie(String name){
        this.itsName = name;
    }

    public String plot(){
        return "No plot here.";
    }

    public String getItsName(){
        return this.itsName;
    }
}

class Jaws extends Movie {

    public Jaws(){
        super("Jaws");
    }
    
    @Override
    public String plot(){
        return "A shark eats lots of people";
    }
}

class IndependenceDay extends Movie {

    public IndependenceDay(){
        super("Independence Day");
    }

    @Override
    public String plot(){
        return "Aliens attempt to take over planet Earth.";
    }
}

class MazeRunner extends Movie {

    public MazeRunner(){
        super("Maze Runner");
    }

    @Override
    public String plot(){
        return "Kids try and escape a maze.";
    }

}

class StarWars extends Movie {

    public StarWars(){
        super("Star Wars");
    }

    @Override
    public String plot(){
        return "Imperial Forces try to take over the universe.";
    }

}

class Forgetable extends Movie {

    public Forgetable(){
        super("Forgetable");
    }

}


public class Main {


    public static Movie randomMovie(){
        int randomNumber = (int)(Math.random() * 5) + 1;
        System.out.println( "Random No.: " + randomNumber );
        
        switch(randomNumber){
            case 1:
                return new Jaws();
            case 2:
                return new IndependenceDay();
            case 3:
                return new MazeRunner();
            case 4:
                return new StarWars();
            case 5:
                return new Forgetable();
            default:
                return null;
        }
    }
    
    public static void main ( String[] args ){

        System.out.print("\033[H\033[2J");

        for(int i = 1; i < 11; i++){
            Movie theMovie = randomMovie();
            System.out.println( "Movie #" + i + " : " + theMovie.getItsName() 
                    + "\nPlot: " + theMovie.plot() + "\n" );
        }
    }

}
