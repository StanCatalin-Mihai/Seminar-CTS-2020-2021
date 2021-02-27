package program;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");

        Zoo zoo = new Zoo();
        Giraffe g1 = new Giraffe("Girafa1");
        Giraffe g2 = new Giraffe("Girafa2");

        zoo.addAnimal(g1);
        zoo.addAnimal(g2);

        zoo.hranireAnimale();
    }

}
