package com.company;

import java.util.*;

public class _2_Input {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");

        // String name = sc.next();
        String name = sc.nextLine();

        System.out.print("Hello ");
        System.out.print(name);
        System.out.print(" we welcome you to java world.");

    }
}
