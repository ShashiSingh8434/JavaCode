package com.company;

import java.util.*;

public class _7_Multiplication_table_generation_using_loop {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n:");
        int n = sc.nextInt();

        for (int i = 1; i < 11; i++) {
            System.out.println(n + " X " + i + " = " + n*i);
        }

    }
}
