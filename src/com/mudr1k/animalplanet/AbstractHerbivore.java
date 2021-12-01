package com.mudr1k.animalplanet;

public abstract class AbstractHerbivore implements Animal {
    public void eat(Plant food) {
        System.out.println(getClass().getSimpleName() + " eat " + food.getClass().getSimpleName());
    }
}
