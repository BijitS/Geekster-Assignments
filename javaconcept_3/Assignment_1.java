package com.company.javaconcept_3;

public class Assignment_1 {
    public static void main(String[] args) {

        //Print left traingle star pattern.

        int row = 10;

        for (int i = 1; i <=row; i++)
        {
            for (int j = 9; j>=i; j--)
            {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
