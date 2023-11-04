package com.javacp.masters.hackerrank.dsa;

public class Staircase {
    public static void staircase(int n) {
        // Write your code here

        for (int i = 1; i <= n; i++) {

            // Print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Print '#' symbols
            for (int j = 1; j <= i; j++) {
                System.out.print("#");
            }


            System.out.println(); // new line
        }


    }

    public static void main(String[] args) {
        staircase(6);
    }
}
