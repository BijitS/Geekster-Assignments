package com.company.javapractice_2;
import java.util.Scanner;
public class Compound_interest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the principle value");
        double P = sc.nextDouble();

        System.out.println("Enter the rate value");
        double R = sc.nextDouble();

        System.out.println("Enter the time");
        double T = sc.nextDouble();

        System.out.println("Enter number of times interest in compounded");
        double N = sc.nextDouble();

        double ans = P * Math.pow(1+(R/100),(N*T))-P;

        System.out.println("The Compound interest is "+ans);
    }
}
