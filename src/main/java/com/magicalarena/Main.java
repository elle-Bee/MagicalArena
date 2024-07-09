package com.magicalarena;

/**
 * The Main class initializes players and starts the fight in the arena.
 */
public class Main {
    public static void main(String[] args) {
        try {
            // Initialize players
            Player player1 = new Player("Player1", 50, 5, 10);
            Player player2 = new Player("Player2", 100, 10, 5);

            // Create the arena and start the fight
            Arena arena = new Arena(player1, player2);
            arena.fight();
        } catch (Exception e) {
            // Handle any unexpected exceptions
            System.err.println("An error occurred during the game: " + e.getMessage());
            e.printStackTrace();
        }
    }
}