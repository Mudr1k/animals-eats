package com.mudr1k.animalplanet;

public interface Herbivore extends Animal {
    default void eat(Plant food) {
        System.out.println(getClass().getSimpleName() + " eat " + food.getClass().getSimpleName());
    }
}
