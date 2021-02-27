package program;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private Zookeeper zookeeper;
    private List<Animal> animals;

    public Zoo() {
        this.animals = new ArrayList<>();
        this.zookeeper = new Zookeeper("Gigel");
    }

    public Zoo(Zookeeper zookeeper, List<Animal> animal) {
        this.zookeeper = zookeeper;
        this.animals = animal;
    }

    public void addAnimal(Animal animalDeAdaugat)
    {
        this.animals.add(animalDeAdaugat);
    }

    public void hranireAnimale()
    {
        this.animals.forEach(animal -> {
            zookeeper.feed(animal);
        });
    }
}
