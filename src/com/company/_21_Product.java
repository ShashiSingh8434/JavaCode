package com.company;

import java.util.*;

public class _21_Product{
    public static int multi(int a, int b){
        System.out.println("Multiplication: "+(a*b));
        return 1;
    }
    public static void factorial(int a){
        int fact = 1;
        for (int i = 1; i <= a; i++) {
            fact = fact*i;
        }
        System.out.println("The factorial is: "+fact);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

//        System.out.print("Enter two numbers:");
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        multi(a,b);

        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        factorial(a);
    }
}