package com.company.javaconcept_3;

public class Assignment_1 {
    public static void main(String[] args) {

        //Print left traingle star pattern.

        int i, j, row = 6;

        for (i = 0; i < row; i++) {
            for (j = 2 * (row - i); j >= 0; j--) {
                System.out.print(" ");
            }
            for (j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
