package com.mudr1k.animalplanet.animal;

import com.mudr1k.animalplanet.Edible;
import com.mudr1k.animalplanet.Plant;

public class Panda extends AbstractBear {

    @Override
    public void eat(Edible food) {
        try {
            Plant plant = (Plant) food;
            System.out.println(getClass().getSimpleName() + " eat " + plant.getClass().getSimpleName());
        } catch (ClassCastException e) {
            System.out.println("Panda doesn't eat " + food.getClass().getSimpleName() + " flesh");
        }
    }
}
