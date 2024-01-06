package com.amrita.jpl.cys21080.practice.basics;


/**
 * @author T. Pavan Kumar Reddy
 * @version 1.0
 * The Pattern class generates a pattern consisting of asterisks and equal signs.
 */
public class Flag_pattern {
    /**
     * The main method generates and prints the pattern.
     *
     * @param args The command-line arguments.
     */
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            System.out.println("* * * * * * ===================================");
            System.out.println("* * * * *  ====================================");
        }

        System.out.println("* * * * * * ===================================");

        for (int i = 0; i < 5; i++) {
            System.out.println("===============================================");
        }
    }
}