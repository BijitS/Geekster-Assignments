package com.company.javapractice_2;
import java.util.Scanner;
public class Assignment_5 {
    public static void main(String[] args){

        //Distance between two points.

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter coordinates of first point");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();

        System.out.println("Enter coordinates of second point");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        int X = x2-x1;
        int Y = y2-y1;

        double distance = Math.sqrt(X*X+Y*Y);
        System.out.println("The total distance between two point is "+distance );
    }
}
