package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {

    // TODO - Create tests for `void add(Cat cat)`
    @Test
    public void addCatTest() {
        // Given cat data
        Cat cat = new Cat(null, null, null);
        CatHouse catHouse = new CatHouse();

        // When a cat is added
        catHouse.add(cat);

//        System.out.println(expectedAddedCat);
        // Then the expected should increase
        Integer expectedAddedCat = new Integer(1) ;
        Integer actualAddedCat = catHouse.getNumberOfCats();
        Assert.assertEquals(expectedAddedCat, actualAddedCat);
    }

    // TODO - Create tests for `void remove(Integer id)`
    @Test
    public void removeCatId() {
        // Given cat data
        Cat joe = new Cat("Joe", new Date(), 12);
        CatHouse house = new CatHouse();
        house.add(joe);
        Integer catId = joe.getId();

        // When a cat is removedById
        house.remove(catId);

        // Then
        Integer expectedRemovedCat = 0;
        Integer actualRemovedCat = house.getNumberOfCats();
        Assert.assertEquals(expectedRemovedCat, actualRemovedCat);
    }

    // TODO - Create tests for `void remove(Cat cat)`
    @Test
    public void removeCatTest() {
        // Given cat data
        Cat cat = new Cat(null, null, null);
        CatHouse house = new CatHouse();
        house.add(cat);

        // When a cat is removed by cat
        house.remove(cat);


        // Then the expected should have no cats
        Integer expectedRemovedCat = 0;
        Integer actualRemovedCat = house.getNumberOfCats();
        Assert.assertEquals(expectedRemovedCat, actualRemovedCat);
    }

    // TODO - Create tests for `Cat getCatById(Integer id)`
    @Test
    public void getCatByIdTest() {
        // Given cat data
        Cat cat = new Cat("Angel", null, 31);
        CatHouse house = new CatHouse();
        house.add(cat);

        // System.out.println(CatHouse.getNumberOfCats());

        // When a cat is retrieved by Id
        String actual = String.format("Cat id: %d and cat name: %s",cat.getId(), cat.getName());
        String expected = "Cat id: 31 and cat name: Angel";

        // Then the expected should return a cat
        Assert.assertEquals(expected, actual);
    }

    // TODO - Create tests for `Integer getNumberOfCats()`

    @Test
    public void getNumberOfCatsTest() {
        // Given
        Cat thor = new Cat(null,null,null);
        Cat hulk = new Cat(null,null,null);
        CatHouse house = new CatHouse();
        house.add(thor);
        house.add(hulk);

//        System.out.println(CatHouse.getNumberOfCats());

        // When a CatHouse retrieves the number of cats
        Integer actualNumberOfCats = house.getNumberOfCats();

        // Then the expected should be the same number of cats
        Integer expectedNumberOfCats = 2;
//        System.out.println(actual);
//        System.out.println(expected);
        Assert.assertEquals(expectedNumberOfCats, actualNumberOfCats);
    }
}
