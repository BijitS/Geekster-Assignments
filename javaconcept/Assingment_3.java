package com.company.javaconcept;
import java.util.Scanner;

public class Assingment_3 {
    public static void main(String[] args){

        //Write an Algorithm that checks two numbers and print average of Two numbers

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number");
        int a = sc.nextInt();

        System.out.println("Enter second number");
        int b = sc.nextInt();

        int c = (a+b)/2;

        System.out.println(c);

    }
}
