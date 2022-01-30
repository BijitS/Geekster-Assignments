package com.company.javapractice;
import java.util.Scanner;
public class Assignment_1 {
    public static void main(String[] args){

        //Write a program that checks if a number is a Prime number. take the user input.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = sc.nextInt();

        int b = 2;

        boolean flag = true;
        while(b<a)
        {
            if(a%b==0)
            {
                flag = false;
                System.out.println("Number is not prime");
                break;
            }
            b++;
        }
        if(flag)
        {
        System.out.println("Number is prime");

        }

    }
}
