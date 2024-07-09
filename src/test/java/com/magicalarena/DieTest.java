package com.magicalarena;

public class DieTest {
    public static void main(String[] args) {
        testRoll();
    }

    // Test the rolling of the die
    public static void testRoll() {
        Die die1 = new Die();
        Die die2 = new Die();
        boolean Die1withinRange = true;
        boolean Die2withinRange = true;

        // Roll the 2 dice multiple times to check if the results are within the expected range
        for (int i = 0; i < 100; i++) {
            int rollResult1 = die1.roll();
            if (rollResult1 < 1 || rollResult1 > 6) {
                Die1withinRange = false;
                break;
            }

            int rollResult2 = die2.roll();
            if (rollResult2 < 1 || rollResult2 > 6) {
                Die2withinRange = false;
                break;
            }
        }

        assert Die1withinRange : "Die1 roll results should be between 1 and 6";
        assert Die2withinRange : "Die2 roll results should be between 1 and 6";

        System.out.println("testRoll passed");
    }
}