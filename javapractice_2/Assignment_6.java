package com.company.javapractice_2;
import java.util.Scanner;
public class Assignment_6 {
    public static void main(String[] args) {

        //WAP to print first x terms of the series 3N + 2 which are not multiples of 4.

        Scanner s = new Scanner(System.in);

        System.out.println("Enter your number");
        int n = s.nextInt();

        int count = 0;

        for (int i = 1; count < n; i++) {
            int ap = 3 * i + 2;
            if (ap % 4 != 0) {
                System.out.print(ap + " ");
                count++;
            }
        }
    }
}


