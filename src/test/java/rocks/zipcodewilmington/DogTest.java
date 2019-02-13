package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`

    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }

    @Test
    public void setBirthDateTest() {
        // Given (a date exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        Date givenBirthDate = new Date(31);

        // When (a dog's birthdate is set to a given date)
        dog.setBirthDate(givenBirthDate);

        // Then (we expect to get the given date from the dog)
        Date actualBirthDate = dog.getBirthDate();
        Assert.assertEquals(givenBirthDate, actualBirthDate);
    }

    @Test
    public void speakTest() {
        // Given (a dog exist)
        Dog dog = new Dog(null, null, null);

        // When (the dog speak method is called)
        String expected = "bark!";

        // Then (we expect to get the given string from the dog)
        String actual = dog.speak();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void eatTest() {
        // Given (a dog exist)
        Dog dog = new Dog(null, null, null);

        // When (the dog food method is called)
        dog.eat(new Food());
        Integer expected = dog.getNumberOfMealsEaten();

        // Then (we expect to get the number of meals eaten from the dog)
        Integer actual = dog.getNumberOfMealsEaten();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getIdTest() {
        // Given (a dog exist)
        Integer givenId = 10;
        Dog dog = new Dog(null, null, givenId);

        // Then (we expect the given id from the dog)
        Integer actual = dog.getId();
        Assert.assertEquals(givenId, actual);
    }

    @Test
    public void dogInstanceOfAnimal() {
        // Given (a dog exist)
        Dog dog = new Dog(null, null, null);

        // Then ( we expect the dog to be an instance of animal)
        Assert.assertTrue(dog instanceof Animal);
    }

    @Test
    public void dogInstanceOfMammal() {
        // Given (a dog exist)
        Dog dog = new Dog(null, null, null);

        // Then ( we expect the dog to be an instance of animal)
        Assert.assertTrue(dog instanceof Mammal);
    }



}
