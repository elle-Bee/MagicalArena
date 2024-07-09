package com.magicalarena;

public class PlayerTest {
    public static void main(String[] args) {
        testPlayerInitialization();
        testCalculateAttackDamage();
        testCalculateDefenseStrength();
        testTakeDamage();
        testIsAlive();
        testHealthBoundaries();
    }

    // Test the initialization of Player object
    public static void testPlayerInitialization() {
        Player player1 = new Player("TestPlayer1", 100, 10, 5);
        Player player2 = new Player("TestPlayer2", 50, 8, 12);

        assert player1.getName().equals("TestPlayer1") : "Player name should be TestPlayer1";
        assert player1.getHealth() == 100 : "Player health should be 100";
        assert player1.getStrength() == 10 : "Player strength should be 10";
        assert player1.getAttack() == 5 : "Player attack should be 5";

        assert player2.getName().equals("TestPlayer2") : "Player name should be TestPlayer2";
        assert player2.getHealth() == 50 : "Player health should be 50";
        assert player2.getStrength() == 8 : "Player strength should be 8";
        assert player2.getAttack() == 12 : "Player attack should be 12";

        System.out.println("testPlayerInitialization passed");
    }

    // Test the calculation of attack damage
    public static void testCalculateAttackDamage() {
        Player player1 = new Player("TestPlayer1", 100, 10, 5);
        Player player2 = new Player("TestPlayer2", 50, 8, 12);

        assert player1.calculateAttackDamage(3) == 15 : "Attack damage should be 15";
        assert player2.calculateAttackDamage(4) == 48 : "Attack damage should be 48";

        System.out.println("testCalculateAttackDamage passed");
    }

    // Test the calculation of defense strength
    public static void testCalculateDefenseStrength() {
        Player player1 = new Player("TestPlayer1", 100, 10, 5);
        Player player2 = new Player("TestPlayer2", 50, 8, 12);

        assert player1.calculateDefenseStrength(2) == 20 : "Defense strength should be 20";
        assert player2.calculateDefenseStrength(3) == 24 : "Defense strength should be 24";

        System.out.println("testCalculateDefenseStrength passed");
    }

    // Test the damage dealt to player's health
    public static void testTakeDamage() {
        Player player1 = new Player("TestPlayer1", 100, 10, 5);
        Player player2 = new Player("TestPlayer2", 50, 8, 12);

        player1.takeDamage(30);
        assert player1.getHealth() == 70 : "Player health should be 70 after taking 30 damage";
        player1.takeDamage(80);
        assert player1.getHealth() == 0 : "Player health should be 0 after taking 80 damage";

        player2.takeDamage(20);
        assert player2.getHealth() == 30 : "Player health should be 30 after taking 20 damage";
        player2.takeDamage(40);
        assert player2.getHealth() == 0 : "Player health should be 0 after taking 40 damage";

        System.out.println("testTakeDamage passed");
    }

    // Test the player's alive status based on health
    public static void testIsAlive() {
        Player player1 = new Player("TestPlayer1", 100, 10, 5);
        Player player2 = new Player("TestPlayer2", 50, 8, 12);

        assert player1.isAlive() : "Player should be alive";
        player1.takeDamage(100);
        assert !player1.isAlive() : "Player should be dead";

        assert player2.isAlive() : "Player should be alive";
        player2.takeDamage(50);
        assert !player2.isAlive() : "Player should be dead";

        System.out.println("testIsAlive passed");
    }

    // Test health boundary conditions to ensure health doesn't drop below 0
    public static void testHealthBoundaries() {
        Player player1 = new Player("TestPlayer1", 100, 10, 5);
        Player player2 = new Player("TestPlayer2", 50, 8, 12);

        player1.takeDamage(150);
        assert player1.getHealth() == 0 : "Player health should not go below 0";

        player2.takeDamage(60);
        assert player2.getHealth() == 0 : "Player health should not go below 0";

        System.out.println("testHealthBoundaries passed");
    }
}