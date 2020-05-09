public class Main {

    public static void main ( String[] args ){

        System.out.print("\033[H\033[2J");

        Animal animal = new Animal("Animal", 1, 1, 5, 5);
        Fish fish = new Fish("Goldfish", 8, 1, 1, 2, 1);

        fish.swim(5);

    }

}
