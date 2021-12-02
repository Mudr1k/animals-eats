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
        BrownBear brownBear = new BrownBear();
        Panda panda = new Panda();
        WhiteBear whiteBear = new WhiteBear();
        Rat rat = new Rat();

        try {
            lion.eat(lion);
        } catch (InvalidParameterException e) {
            System.err.println(e.getMessage());
        }
        lion.eat(goat);
        lion.eat(cow);
//        lion.eat(grass);
        lion.eat(brownBear);
        lion.eat(panda);
        lion.eat(whiteBear);
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

        brownBear.eat(lion);
        brownBear.eat(goat);
        brownBear.eat(cow);
        brownBear.eat(grass);
        try {
            brownBear.eat(brownBear);
        } catch (InvalidParameterException e) {
            System.err.println(e.getMessage());
        }
        brownBear.eat(panda);
        brownBear.eat(whiteBear);
        brownBear.eat(rat);

//        panda.eat(lion);
//        panda.eat(goat);
//        panda.eat(cow);
        panda.eat(grass);
//        panda.eat(abstractBear);
//        panda.eat(panda);
//        panda.eat(whiteBear);
//        panda.eat(rat);

        whiteBear.eat(lion);
        whiteBear.eat(goat);
        whiteBear.eat(cow);
//        whiteBear.eat(grass);
        whiteBear.eat(brownBear);
        whiteBear.eat(panda);
        try {
            whiteBear.eat(whiteBear);
        } catch (InvalidParameterException e) {
            System.err.println(e.getMessage());
        }
        whiteBear.eat(rat);

        rat.eat(lion);
        rat.eat(goat);
        rat.eat(cow);
        rat.eat(grass);
        rat.eat(brownBear);
        rat.eat(panda);
        rat.eat(whiteBear);
        try {
            rat.eat(rat);
        } catch (InvalidParameterException e) {
            System.err.println(e.getMessage());
        }
    }
}
