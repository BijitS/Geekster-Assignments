package com.company.javapractice_2;
import java.util.Scanner;
public class Sum_of_even_odd_digit {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your number");
        int a = sc.nextInt();

        int sumevn = 0;
        int sumodd = 0;

        while(a>0)
        {
            int rem = a%10;
            if(rem%2==0) {
                int even = rem;
                sumevn = sumevn+even;
            }
            else
            {
                int odd = rem;
                sumodd = sumodd+odd;
            }
            a = a/10;

        }

        System.out.println("Sum of even digit "+sumevn);
        System.out.println("Sum of odd digit "+sumodd);
    }
}
