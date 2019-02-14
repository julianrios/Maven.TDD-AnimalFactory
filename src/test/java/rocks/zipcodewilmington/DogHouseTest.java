package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Dog dog)`
    // TODO - Create tests for `Dog getDogById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfDogs()`

    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse house = new DogHouse();
        house.clear();

        // When
        house.add(animal);

        // Then
        Integer expected = 1;
        Integer actual = house.getNumberOfDogs();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeDogId() {
     // Given Dog data
     Dog dog = new Dog(null, null, 10);
     DogHouse house = new DogHouse();
        house.add(dog);
        Integer dogId = dog.getId();

        // When a Dog is removed
        house.remove(dogId);

    // Then the expected should increase
    Integer expected = 0 ;
    Integer actual = house.getNumberOfDogs();
    Assert.assertEquals(expected, actual);
    }

    // TODO - Create tests for `void remove(Dog Dog)`
    @Test
    public void removeDogTest() {
        // Given Dog data
        Dog dog = new Dog(null, null, null);
        DogHouse house = new DogHouse();
        house.add(dog);


        // When a Dog is removed by Dog
        house.remove(dog);


        // Then the expected should have no Dogs
        Integer actualAfterRemovedDogId = house.getNumberOfDogs();
        Integer expectedRemovedDogId = 0;
        Assert.assertEquals(expectedRemovedDogId, actualAfterRemovedDogId);
    }

    // TODO - Create tests for `Dog getDogById(Integer id)`
    @Test
    public void getDogByIdTest() {
        // Given Dog data
        Dog Dog = new Dog("Angel", null, 31);
        DogHouse house = new DogHouse();
        house.add(Dog);

        // System.out.println(DogHouse.getNumberOfDogs());

        // When a Dog is retrieved by Id
        String actual = String.format("Dog id: %d and Dog name: %s",Dog.getId(), Dog.getName());
        String expected = "Dog id: 31 and Dog name: Angel";

        // Then the expected should return a Dog
        Assert.assertEquals(actual, expected);
    }

    // TODO - Create tests for `Integer getNumberOfDogs()`

    @Test
    public void getNumberOfDogsTest() {
        // Given
        Dog thor = new Dog(null,null,null);
        Dog hulk = new Dog(null,null,null);
        DogHouse house = new DogHouse();
        house.add(thor);
        house.add(hulk);

//        System.out.println(DogHouse.getNumberOfDogs());

        // When a DogHouse retrieves the number of Dogs
        Integer actualNumberOfDogs = house.getNumberOfDogs();

        // Then the expected should be the same number of Dogs
        Integer expectedNumberOfDogs = 2;
//        System.out.println(actual);
//        System.out.println(expected);
        Assert.assertEquals(expectedNumberOfDogs, actualNumberOfDogs);
    }
}
