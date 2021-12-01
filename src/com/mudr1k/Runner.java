package com.mudr1k;

import com.mudr1k.animalplanet.animal.*;
import com.mudr1k.animalplanet.plant.Grass;

import java.security.InvalidParameterException;

public class Runner {
    public static void main(String[] args) {
        Lion lion = new Lion();
        Goat goat = new Goat();
        Cow cow = new Cow();
        Grass grass = new Grass();

        AbstractBear abstractBear = new AbstractBear();
        AbstractBear panda = new Panda();
        AbstractBear whiteBear = new WhiteBear();

        Rat rat = new Rat();

//        lion.eat(lion);
        lion.eat(goat);
        lion.eat(cow);
//        lion.eat(grass);
//        lion.eat(abstractBear);
//        lion.eat(panda);
//        lion.eat(whiteBear);
        lion.eat(rat);

//        goat.eat(lion);
//        goat.eat(goat);
//        goat.eat(cow);
        goat.eat(grass);
//        goat.eat(abstractBear);
//        goat.eat(panda);
//        goat.eat(whiteBear);
//        goat.eat(rat);

        cow.eat(grass);

//        abstractBear.eat(lion);
        abstractBear.eat(goat);
        abstractBear.eat(cow);
        abstractBear.eat(grass);
//        abstractBear.eat(abstractBear);
//        abstractBear.eat(panda);
//        abstractBear.eat(whiteBear);
        abstractBear.eat(rat);

//        panda.eat(lion);
        panda.eat(goat);
        panda.eat(cow);
        panda.eat(grass);
//        panda.eat(abstractBear);
//        panda.eat(panda);
//        panda.eat(whiteBear);
        panda.eat(rat);

//        whiteBear.eat(lion);
        whiteBear.eat(goat);
        whiteBear.eat(cow);
        whiteBear.eat(grass);
//        whiteBear.eat(abstractBear);
//        whiteBear.eat(panda);
//        whiteBear.eat(whiteBear);
        whiteBear.eat(rat);

//        rat.eat(lion);
        rat.eat(goat);
        rat.eat(cow);
        rat.eat(grass);
//        rat.eat(abstractBear);
//        rat.eat(panda);
//        rat.eat(whiteBear);
        try {
            rat.eat(rat);
        } catch (InvalidParameterException e) {
            System.err.println(e.getMessage());
        }
    }
}
