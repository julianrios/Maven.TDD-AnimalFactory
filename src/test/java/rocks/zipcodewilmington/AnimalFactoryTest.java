package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`

    @Test
    public void createDogTest() {
        // Given (dog data construct a dog)
        String givenName = "Fido";
        Date givenBirthDate = new Date(31);
        Dog fido = AnimalFactory.createDog(givenName, givenBirthDate);

        // When (we retrieve the data from the dog)
        String actualName = fido.getName();
        Date actualBirthDate = fido.getBirthDate();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, actualName);
//        System.out.println(givenName + " " + actualName);
        Assert.assertEquals(givenBirthDate, actualBirthDate);
//        System.out.println(givenBirthDate.toString() + " " + actualBirthDate.toString());
        Assert.assertTrue(fido instanceof Dog);
    }

    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`

    @Test
    public void createCatTest() {
        // Given (dog data construct a cat)
        String givenName = "Luna";
        Date givenBirthDate = new Date(20);
        Mammal luna = AnimalFactory.createCat(givenName, givenBirthDate);

        // When (we retrieve the data from the dog)
        String actualName = luna.getName();
        Date actualBirthDate = luna.getBirthDate();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, actualName);
//        System.out.println(givenName + " " + actualName);
        Assert.assertEquals(givenBirthDate, actualBirthDate);
//        System.out.println(givenBirthDate.toString() + " " + actualBirthDate.toString());
        Assert.assertTrue(luna instanceof Cat);
    }




}
