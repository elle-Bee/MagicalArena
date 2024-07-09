package com.magicalarena;

/**
 * The DieTest class contains test methods for the Die class.
 */
public class DieTest {
    public static void main(String[] args) {
        testRoll();
    }

    /**
     * Tests the rolling of the die to ensure it produces results within the expected range.
     */
    public static void testRoll() {
        try {
            Die die1 = new Die();
            Die die2 = new Die();
            boolean die1WithinRange = true;
            boolean die2WithinRange = true;

            // Roll the dice multiple times to check if the results are within the expected range
            for (int i = 0; i < 100; i++) {
                int rollResult1 = die1.roll();
                if (rollResult1 < 1 || rollResult1 > 6) {
                    die1WithinRange = false;
                    break;
                }

                int rollResult2 = die2.roll();
                if (rollResult2 < 1 || rollResult2 > 6) {
                    die2WithinRange = false;
                    break;
                }
            }

            // Assert the results
            assert die1WithinRange : "Die1 roll results should be between 1 and 6";
            assert die2WithinRange : "Die2 roll results should be between 1 and 6";

            System.out.println("testRoll passed");
        } catch (AssertionError e) {
            System.err.println("testRoll failed: " + e.getMessage());
        }
    }
}