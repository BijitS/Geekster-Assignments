package com.company.javaconcept;
import java.util.Scanner;
public class Assignment_2 {
    public static void main (String[] args){

        //Write a program that checks two number and print the minimum of two numbers

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first Number");
        int a = sc.nextInt();

        System.out.println("Enter second Number");
        int b = sc.nextInt();

        if(a>b)
        {
            System.out.println("b is smaller than a");
        }
        else
        {
            System.out.println("a is smaller than b");
        }
    }
}
