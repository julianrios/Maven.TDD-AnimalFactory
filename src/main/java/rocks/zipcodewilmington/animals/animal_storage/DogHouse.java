package rocks.zipcodewilmington.animals.animal_storage;

import rocks.zipcodewilmington.animals.Dog;

/**
 * @author leon on 4/19/18.
 */
public class DogHouse {
    private AnimalWarehouse<Dog> dogHouse = new AnimalWarehouse<>();

    public void add(Dog dog) {
        dogHouse.add(dog);
    }

    public void remove(Integer id) {
        dogHouse.removeAnimalById(id);
    }

    public void remove(Dog dog) {
        dogHouse.removeAnimal(dog);
    }

    public Dog getDogById(Integer id) {
        return dogHouse.getAnimalById(id);
    }

    public Integer getNumberOfDogs() {
        return dogHouse.getNumberOfAnimals();
    }

    public void clear() {
        dogHouse.clear();
    }
}
