package com.mudr1k.animalplanet;

public interface Carnivore extends Animal {
    default void eat(Flesh food) {
        checkCannibal(food);
        System.out.println(getClass().getSimpleName() + " eat " + food.getClass().getSimpleName());
    }
}
