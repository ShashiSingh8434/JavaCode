package com.company;

import java.util.*;

public class _5_Switch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter num 1:");
        int a = sc.nextInt();
        System.out.print("Enter num 2:");
        int b = sc.nextInt();

        System.out.print("Enter: 1 for addition\n\t   2 for subtraction\n-->");
        int op = sc.nextInt();

        switch(op) {
            case 1 :
                System.out.print(a+b);
                break;
            case 2 :
                System.out.println(a-b);
                break;
            default:
                System.out.println("Invalid Input");
        }
    }
}
