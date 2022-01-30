package com.company.javaconcept_2;
import java.util.Scanner;
public class Assignment_4 {
    public static void main(String[] args){

        //Write a program to swap 2 numbers, where numbers are taken from user

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number");
        int a = sc.nextInt();

        System.out.println("Enter second number");
        int b = sc.nextInt();

        System.out.println("Before Swap");

        System.out.println("A = "+a);
        System.out.println("B = "+b);

        System.out.println("After Swap");

        int t = a;

        //Swap two numbers
        a = b;
        b = t;
        System.out.println("A = "+a);
        System.out.println("B = "+b);


    }
}
