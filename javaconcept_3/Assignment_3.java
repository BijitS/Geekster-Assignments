package com.company.javaconcept_3;

public class Assignment_3 {
    public static void main(String[] args) {

        //Diamond Pattern

        int i, j, sp = 1;
        int row = 4;
        sp = row - 1;
        for (j = 1; j <= row; j++) {
            for (i = 1; i <= sp; i++) {
                System.out.print(" ");
            }
            sp--;
            for (i = 1; i <= 2 * j - 1; i++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        sp = 1;
        for (j = 1; j <= row - 1; j++) {
            for (i = 1; i <= sp; i++) {
                System.out.print(" ");
            }
            sp++;
            for (i = 1; i <= 2 * (row - j) - 1; i++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
