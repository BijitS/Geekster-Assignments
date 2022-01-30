package com.company.javaconcept_2;
import java.util.Scanner;
public class Assignment_1 {
   public static void main(String[] args){

       //Use while loop to calculate sum of numbers till n, where n is taken from user

       Scanner sc = new Scanner(System.in);

       System.out.println("Enter the number");
       int a = sc.nextInt();

       int b = 1;

       int sum = 0;

       while(b<=a)
       {
         sum = sum + b;
         b++;
       }
       System.out.println("Sum of numbers till "+a+" is "+sum);
   }
}
