package com.mudr1k.animalplanet;

public interface AbstractOmnivore extends Animal {
    default void eat(Edible food) {
        checkCannibal(food);
        System.out.println(getClass().getSimpleName() + " eat " + food.getClass().getSimpleName());
    }
}
