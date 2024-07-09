package com.magicalarena;

/**
 * The Player class represents a player in the magical arena with attributes such as health, strength, and attack.
 */
public class Player {
    private String name;
    private int health;
    private int strength;
    private int attack;

    /**
     * Constructs a Player with the specified attributes.
     *
     * @param name the name of the player
     * @param health the health of the player, must be a positive integer
     * @param strength the strength of the player, must be a positive integer
     * @param attack the attack value of the player, must be a positive integer
     * @throws IllegalArgumentException if health, strength, or attack are not positive integers
     */
    public Player(String name, int health, int strength, int attack) {
        if (health <= 0 || strength <= 0 || attack <= 0) {
            throw new IllegalArgumentException("Health, strength, and attack must be positive integers.");
        }
        this.name = name;
        this.health = health;
        this.strength = strength;
        this.attack = attack;
    }

    // Getters

    public String getName() {
        return name;
    }

    public int getAttack() {
        return attack;
    }

    public int getStrength() {
        return strength;
    }

    public int getHealth() {
        return health;
    }

    /**
     * Calculates the attack damage based on the player's attack attribute and the die roll.
     *
     * @param dieRoll the result of the die roll
     * @return the calculated attack damage
     */
    public int calculateAttackDamage(int dieRoll) {
        return this.attack * dieRoll;
    }

    /**
     * Calculates the defense strength based on the player's strength attribute and the die roll.
     *
     * @param dieRoll the result of the die roll
     * @return the calculated defense strength
     */
    public int calculateDefenseStrength(int dieRoll) {
        return this.strength * dieRoll;
    }

    /**
     * Reduces the player's health by the specified damage amount. Ensures that health does not go below zero.
     *
     * @param damage the amount of damage to apply
     */
    public void takeDamage(int damage) {
        this.health -= damage;
        if (this.health < 0) {
            this.health = 0;  // Ensure health doesn't go below 0
        }
    }

    /**
     * Checks if the player is still alive (health > 0).
     *
     * @return true if the player is alive, false otherwise
     */
    public boolean isAlive() {
        return this.health > 0;
    }
}