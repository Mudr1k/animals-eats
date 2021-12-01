package com.mudr1k.animalplanet.animal;

import com.mudr1k.animalplanet.Edible;
import com.mudr1k.animalplanet.Flesh;

public class WhiteBear extends AbstractBear {

    @Override
    public void eat(Edible food) {
        try {
            checkCannibal(food);
            Flesh flesh = (Flesh) food;
            System.out.println(getClass().getSimpleName() + " eat " + flesh.getClass().getSimpleName());
        }   catch (ClassCastException e) {
            System.out.println("WhiteBear doesn't eat " + food.getClass().getSimpleName() + " plant");
        }
    }
}
