package com.company.javaconcept_2;
import java.util.Scanner;
public class Assignment_2 {
    public static void main(String[] args){

        //Use while loop to calculate factorial of a number by taking user input

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        int a = sc.nextInt();

        int b = 1;

        int ans = 1;

        while(b<=a)
        {
            ans = ans*b;
            b++;
        }
        System.out.println("Factorial of "+a+" is "+ans);
    }
}
