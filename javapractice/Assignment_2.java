package com.company.javapractice;
import java.util.Scanner;
public class Assignment_2 {
    public static void main(String[] args){

        //Java Program to calculate power of a number
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        int base = sc.nextInt();

        System.out.println("Enter the power");
        int exponent = sc.nextInt();

        int ans = 1;

        while(exponent!=0)
        {
            ans = ans*base;
            exponent--;
        }
        System.out.println("Answer is : "+ans);
    }
}
