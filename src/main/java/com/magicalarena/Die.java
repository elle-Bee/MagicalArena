package com.magicalarena;

import java.util.Random;

/**
 * The Die class represents a six-sided die used in the magical arena.
 */
public class Die {
    private Random rand;

    public Die() {
        this.rand = new Random();
    }

    /**
     * Rolls the die and returns a random number between 1 and 6.
     *
     * @return a random number between 1 and 6
     */
    public int roll() {
        return rand.nextInt(6) + 1;
    }
}