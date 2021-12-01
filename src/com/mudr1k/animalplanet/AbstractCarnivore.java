package com.mudr1k.animalplanet;

public abstract class AbstractCarnivore implements Animal {
    public void eat(Flesh food) {
        checkCannibal(food);
        System.out.println(getClass().getSimpleName() + " eat " + food.getClass().getSimpleName());
    }
}
