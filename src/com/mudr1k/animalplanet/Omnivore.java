package com.mudr1k.animalplanet;

public interface Omnivore extends Animal {
    default void eat(Edible food) {
        checkCannibal(food);
        System.out.println(getClass().getSimpleName() + " eat " + food.getClass().getSimpleName());
    }
}
