package com.magicalarena;

public class Arena {
    private int round;
    private Player player1;
    private Player player2;
    private Die die;

    public Arena (Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        this.die = new Die();
        this.round = 0;
    }

    // Method which starts fight between player1 and player2
    public void fight() {
        // Fight continues until one of the player dies
        while (player1.isAlive() && player2.isAlive()) {
            // Player1 attacks first
            playRound(player1, player2);
            // If player2 is still alive it counter-attacks
            if (player2.isAlive()) {
                playRound(player2, player1);
            }
        }

        // Determines the winner
        if (!player1.isAlive()) {
            System.out.println(player2.getName() + " wins!");
        } else if (!player2.isAlive()) {
            System.out.println(player1.getName() + " wins!");
        }
    }

    // Method to attack one round of attack + defense and display the workings
    public void playRound(Player attacker, Player defender) {
        int attackRoll = die.roll();
        int defenseRoll = die.roll();

        int attackDamage = attacker.calculateAttackDamage(attackRoll);
        int defenseStrength = defender.calculateDefenseStrength(defenseRoll);
        int effectiveDamage = attackDamage - defenseStrength;
        round++;

        // Print the details of the round
        System.out.println("ROUND " + round);
        System.out.println(attacker.getName() + " attacks and rolls die. Die roll: " + attackRoll + ". ");
        System.out.println(defender.getName() + " defends and rolls die. Die roll: " + defenseRoll + ".");
        System.out.println("Attack Damage is " + attackRoll + "*" + attacker.getAttack() + "=" + attackDamage + ".");
        System.out.println("Defending Strength is " + defenseRoll + "*" + defender.getStrength() + "=" + defenseStrength + ".");

        // Apply the effective damage to the defender if positive
        if (effectiveDamage > 0) {
            defender.takeDamage(effectiveDamage);
            System.out.println(defender.getName() + "'s health reduced by " + effectiveDamage + " to " + defender.getHealth() + ".");
        } else {
            System.out.println(defender.getName() + "'s health reduced by nothing and remains at " + defender.getHealth() + ".");
        }
        System.out.println();
    }
}