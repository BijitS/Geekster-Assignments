package com.company.javaconcept_2;
import java.util.Scanner;
public class Assignment_3 {
    public static void main(String[] args){

        //Write a program to print multiplication table of a number entered by user

        Scanner sc =  new Scanner(System.in);

        System.out.println("Enter the number");
        int a = sc.nextInt();

        int b = 10;
        int c = 1;

        System.out.println("Multiplication table of "+a+" is");
        while(c<=b)
        {
            int ans = a*c;
            System.out.println(ans);
            c++;
        }

    }
}
