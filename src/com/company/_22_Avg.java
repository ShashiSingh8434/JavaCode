package com.company;

import java.util.*;

public class _22_Avg {
    public static void avg(int a,int b,int c){
        System.out.print("Average: ");
        System.out.println((a+b+c)/3);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three number:");

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        avg(a,b,c);
    }
}
