package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    // TODO - Create tests for `void setName(String name)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`



    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

    @Test
    public void setNameTest() {
        // Given (cat data)
        String givenName = "Milo";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat us constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve the data from the cat)
        cat.setName(givenName);
        String actual = cat.getName();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, actual);
    }

    @Test
    public void setBirthDateTest() {
        // Given (cat data)
        String givenName = "Jinx";
        Date givenBirthDate = new Date(31);
        Integer givenId = 0;


        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);


        // When (we retrieve the data from the cat)
        cat.setBirthDate(givenBirthDate);
        Date actual = cat.getBirthDate();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenBirthDate, actual);
    }

    @Test
    public void speakTest() {
        // Given (cat data)
        String givenName = "Jinx";
        Date givenBirthDate = new Date();
        Integer givenId = 0;


        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);


        // When (we retrieve the data from the cat)
        String expected = "meow!";
        String actual = cat.speak();


        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(expected, actual);
        // Assert.assertEquals("MEOW", actual);
    }

    @Test
    public void eatTest() {
        // Given (cat data)
        String givenName = "Fluffy";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When the cat method is called and food is passed in
        cat.eat(new Food());
        Integer expected = cat.getNumberOfMealsEaten();

        // When (we retrieve the data from the cat)
        Integer actual = cat.getNumberOfMealsEaten();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getIdTest() {
        // Given (cat data)
        String givenName = "Bo";
        Date givenBirthDate = new Date();
        Integer givenId = 13;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);


        // When (we retrieve the data from the cat)
        Integer expected = givenId;
        Integer actual = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void catInstanceOfAnimalTest() {
        // Given
        String givenName = "Sleepy";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat sleepy = new Cat(givenName, givenBirthDate, givenId);

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertTrue(sleepy instanceof Animal);
    }

    @Test
    public void catInstanceOfMammal() {
        // Given
        String givenName = "Sleepy";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat sleepy = new Cat(givenName, givenBirthDate, givenId);

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertTrue(sleepy instanceof Mammal);
    }
}
