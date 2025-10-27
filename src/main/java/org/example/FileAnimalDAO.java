package org.example;

import java.util.ArrayList;
import java.util.List;

public class FileAnimalDAO implements AnimalDAO{
    @Override
    public void saveAnimal(Animal a) {
        System.out.println("Animal saved");
    }

    @Override
    public List<Animal> getAnimals() {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("A", 10, Animal.GenderType.FEMALE));
        animals.add(new Animal("B", 10, Animal.GenderType.FEMALE));
        return animals;
    }

    @Override
    public void updateAnimal(Animal a) {
        //TODO
    }

    @Override
    public void deleteAnimal(Animal a) {
        //TODO
    }
}
