package com.magicalarena;

import java.util.Random;

public class Die {
    private Random rand;

    public Die() {
        this.rand = new Random();
    }

    public int roll() {
        return rand.nextInt(6) + 1;
    }
}