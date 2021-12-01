package com.mudr1k.animalplanet;

import java.security.InvalidParameterException;

public interface Animal {

    default void checkCannibal(Edible food) {
        if (getClass().equals(food.getClass())) {
            throw new InvalidParameterException(getClass().getSimpleName() + " eat "
                    + food.getClass().getSimpleName() + " - No cannibals allowed");
        }
    }
}
