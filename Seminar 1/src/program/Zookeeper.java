package program;

public class Zookeeper {
    private String name;

    public Zookeeper(String name) {
        this.name = name;
    }

    public void feed(Animal animal) {
        System.out.println(this.name + " has fed " + animal.getName() + ".");
    }

}
