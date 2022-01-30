package com.company.javaconcept;
import java.util.*;
public class Assingment_1 {
    public static void main(String[] args) {

        //Write a program that checks two number and print maximum of two numbers

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number");
        int a = sc.nextInt();

        System.out.println("Enter Second number");
        int b = sc.nextInt();

        if(a>b)
        {
            System.out.println("a is greater than b");
        }
        else
        {
            System.out.println("b is greater than a");
        }

    }



}
