package com.company.javapractice_2;
import java.util.Scanner;
public class Permutation_Combination {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of n");
        int n = sc.nextInt();

        System.out.println("Enter the value of r");
        int r = sc.nextInt();

        int permutation = fact(n)/fact(n-r);

        System.out.println("Permutation "+permutation);

        int combination = fact(n)/(fact(n-r)*fact(r));

        System.out.println("Combination "+combination);

        }
    public static int fact(int num){

        int fac=1;

        for(int i=1; i<=num; i++)
        {
            fac = fac*i;
        }

        return fac;
    }
}
