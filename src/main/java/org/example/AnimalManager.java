package org.example;

public class AnimalManager {
    AnimalDAO animalDAO;

    public AnimalManager(AnimalDAO animalDAO) {
        this.animalDAO = animalDAO;
    }

    public void manage(){
        Animal a = new Animal("Polar bear", 10, Animal.GenderType.FEMALE);
        animalDAO.saveAnimal(a);
        Animal b = new Animal("Penguin", 10, Animal.GenderType.FEMALE);
        animalDAO.saveAnimal(b);

        Animal c = new Animal("Elephant", 10, Animal.GenderType.MALE);

        Zoo zoo = new Zoo("Debrceen Zoo");
        zoo.getAnimals().add(a);
        zoo.getAnimals().add(b);
        zoo.getAnimals().add(c);

        animalDAO.saveZoo(zoo);

    }
}
