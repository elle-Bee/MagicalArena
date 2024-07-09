package com.magicalarena;

public class ArenaTest {
    public static void main(String[] args) {
        testFight();
        testRoundExecution();
    }

    // Test the fight between players
    public static void testFight() {
        // Case 1
        Player player1 = new Player("Player 1", 50, 5, 10);
        Player player2 = new Player("Player 2", 100, 10, 5);
        Arena arena1 = new Arena(player1, player2);
        arena1.fight();
        assert (!player1.isAlive() || !player2.isAlive()) : "One of the players should be dead after the fight";

        // Case 2
        Player player3 = new Player("Player 3", 30, 6, 8);
        Player player4 = new Player("Player 4", 40, 7, 9);
        Arena arena2 = new Arena(player3, player4);
        arena2.fight();
        assert (!player3.isAlive() || !player4.isAlive()) : "One of the players should be dead after the fight";

        System.out.println("testFight passed");
    }

    // Test a single round
    public static void testRoundExecution() {
        // Case 1
        Player attacker1 = new Player("Attacker1", 100, 10, 15);
        Player defender1 = new Player("Defender1", 100, 10, 5);
        Arena arena1 = new Arena(attacker1, defender1);
        int initialHealth1 = defender1.getHealth();
        arena1.playRound(attacker1, defender1);
        assert defender1.getHealth() < initialHealth1 : "Defender's health should be reduced after the round";

        // Case 2
        Player attacker2 = new Player("Attacker2", 90, 12, 14);
        Player defender2 = new Player("Defender2", 85, 11, 6);
        Arena arena2 = new Arena(attacker2, defender2);
        int initialHealth2 = defender2.getHealth();
        arena2.playRound(attacker2, defender2);
        assert defender2.getHealth() < initialHealth2 : "Defender's health should be reduced after the round";

        System.out.println("testRoundExecution passed");
    }
}