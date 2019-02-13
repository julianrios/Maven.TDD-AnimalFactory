package rocks.zipcodewilmington.animals;

import rocks.zipcodewilmington.Food;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class Cat extends Mammal {

    public Cat(String name, Date birthDate, Integer id) {
        super(name, birthDate, id);
    }

    public String speak() {
        return "meow!";
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public Date getBirthDate() {
        return super.getBirthDate();
    }

    @Override
    public void setBirthDate(Date birthDate) {
        super.setBirthDate(birthDate);
    }

    @Override
    public Integer getNumberOfMealsEaten() {
        return super.getNumberOfMealsEaten();
    }

    @Override
    public void eat(Food food) {
        super.eat(food);
    }

    @Override
    public Integer getId() {
        return super.getId();
    }
}
