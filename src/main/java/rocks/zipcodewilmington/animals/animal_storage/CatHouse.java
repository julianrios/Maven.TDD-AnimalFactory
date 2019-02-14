package rocks.zipcodewilmington.animals.animal_storage;


import rocks.zipcodewilmington.animals.Cat;

/**
 * @author leon on 4/19/18.
 */
public class CatHouse {
    private AnimalWarehouse<Cat> catHouse = new AnimalWarehouse<>();

    public void add(Cat cat) {
        catHouse.add(cat);
    }

    public void remove(Integer id) {
        catHouse.removeAnimalById(id);
    }

    public void remove(Cat cat) {
        catHouse.removeAnimal(cat);
    }

    public Cat getCatById(Integer id) {
        return catHouse.getAnimalById(id);
    }

    public Integer getNumberOfCats() {
        return catHouse.getNumberOfAnimals();
    }

    public void clear() {
        catHouse.clear();
    }
}