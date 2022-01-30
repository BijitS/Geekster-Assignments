package com.company.javapractice_2;
import java.util.Scanner;
public class Assignment_4 {
    public static void main(String[] args){

        //Reverse a number

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        int a = sc.nextInt();

        int rev = 0;

        while(a>0)
        {
            int rem = a%10;
            rev = rev*10 + rem;
            a = a/10;

        }
        System.out.println(rev);

    }
}
