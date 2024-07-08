package com.magicalarena;

public class Dice {

    private Random rand;

    public Dice() {
        this.rand = new Random();
    }

    public int roll() {
        return random.nextInt(6) + 1;
    }
}