package com.magicalarena;

public class Player {
    private int health;
    private int strength;
    private int attack;

    public Player(int health, int strength, int attack) {
        this.health = health;
        this.strength = strength;
        this.attack = attack;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getStrength() {
        return strength;
    }

    public int getAttack() {
        return attack;
    }

    // Setters
    public void setHealth(int health) {
        this.health = health;
    }

    // Method to calculate attack damage
    public int calculateAttackDamage(int diceRoll) {
        return this.attack * diceRoll;
    }

    // Method to calculate defense strength
    public int calculateDefenseStrength(int diceRoll) {
        return this.strength * diceRoll;
    }

    // Method to update damage to health
    public void takeDamage(int damage) {
        this.health -= damage;
        if (this.health < 0) {
            this.health = 0;  // Ensure health doesn't go below 0
        }
    }

    // Method to check if player is alive
    public boolean isAlive() {
        return this.health > 0;
    }
}