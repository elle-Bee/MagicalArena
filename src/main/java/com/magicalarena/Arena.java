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

    public void fight() {
        while (player1.isAlive() && player2.isAlive()) {
            playRound(player1, player2);

            if (player2.isAlive()) {
                playRound(player2, player1);
            }
        }

        if (!player1.isAlive()) {
            System.out.println(player2.getName() + " wins!");
        } else if (!player2.isAlive()) {
            System.out.println(player1.getName() + " wins!");
        }
    }

    private void playRound(Player attacker, Player defender) {
        int attackRoll = die.roll();
        int defenseRoll = die.roll();

        int attackDamage = attacker.calculateAttackDamage(attackRoll);
        int defenseStrength = defender.calculateDefenseStrength(defenseRoll);
        int effectiveDamage = attackDamage - defenseStrength;
        round++;

        System.out.println("ROUND " + round);
        System.out.println(attacker.getName() + " attacks and rolls die. Die roll: " + attackRoll + ". ");
        System.out.println(defender.getName() + " defends and rolls die. Die roll: " + defenseRoll + ".");
        System.out.println("Attack Damage is " + attackRoll + "*" + attacker.getAttack() + "=" + attackDamage + ".");
        System.out.println("Defending Strength is " + defenseRoll + "*" + defender.getStrength() + "=" + defenseStrength + ".");

        if (effectiveDamage > 0) {
            defender.takeDamage(effectiveDamage);
            System.out.println(defender.getName() + "'s health reduced by " + effectiveDamage + " to " + defender.getHealth() + ".");
        } else {
            System.out.println(defender.getName() + "'s health reduced by nothing and remains at " + defender.getHealth() + ".");
        }
        System.out.println();
    }
}