package com.magicalarena;

public class Arena {
    private int round;
    private Player player1;
    private Player player2;
    private Die die;

    public Arena(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        this.die = new Die();
        this.round = 0;
    }

    /**
     * Starts the fight between player1 and player2. The player with lower health attacks first.
     * The fight continues until one of the players dies.
     */
    public void fight() {
        // Determine who attacks first based on the lower health
        if (player1.getHealth() > player2.getHealth()) {
            Player temp = player1;
            player1 = player2;
            player2 = temp;
        }

        // Fight continues until one of the players dies
        while (player1.isAlive() && player2.isAlive()) {
            // Player with lower health (player1) attacks first
            playRound(player1, player2);

            // If player2 is still alive, it counter-attacks
            if (player2.isAlive()) {
                playRound(player2, player1);
            }
        }

        // Determine and print the winner
        if (!player1.isAlive()) {
            System.out.println(player2.getName() + " wins!");
        } else if (!player2.isAlive()) {
            System.out.println(player1.getName() + " wins!");
        }
    }

    /**
     * Simulates one round of attack and defense between the attacker and the defender.
     * Displays the details of the round.
     *
     * @param attacker The player who is attacking
     * @param defender The player who is defending
     */
    public void playRound(Player attacker, Player defender) {
        int attackRoll = die.roll();
        int defenseRoll = die.roll();

        int attackDamage = attacker.calculateAttackDamage(attackRoll);
        int defenseStrength = defender.calculateDefenseStrength(defenseRoll);
        int effectiveDamage = attackDamage - defenseStrength;
        round++;

        // Print the details of the round
        System.out.println("ROUND " + round);
        System.out.println(attacker.getName() + " attacks and rolls die. Die roll: " + attackRoll + ".");
        System.out.println(defender.getName() + " defends and rolls die. Die roll: " + defenseRoll + ".");
        System.out.println("Attack Damage is " + attackRoll + "*" + attacker.getAttack() + " = " + attackDamage + ".");
        System.out.println("Defending Strength is " + defenseRoll + "*" + defender.getStrength() + " = " + defenseStrength + ".");

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