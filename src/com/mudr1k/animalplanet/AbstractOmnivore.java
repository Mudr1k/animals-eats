package com.mudr1k.animalplanet;

public abstract class AbstractOmnivore implements Animal {
    public void eat(Edible food) {
        checkCannibal(food);
        System.out.println(getClass().getSimpleName() + " eat " + food.getClass().getSimpleName());
    }
}
