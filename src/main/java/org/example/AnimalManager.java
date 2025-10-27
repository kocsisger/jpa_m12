package org.example;

public class AnimalManager {
    AnimalDAO animalDAO;

    public AnimalManager(AnimalDAO animalDAO) {
        this.animalDAO = animalDAO;
    }

    public void manage(){
        Animal a = new Animal("Polar bear", 10, Animal.GenderType.FEMALE);
        animalDAO.saveAnimal(a);
    }
}
