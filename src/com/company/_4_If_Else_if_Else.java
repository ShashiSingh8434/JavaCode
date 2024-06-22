package com.company;

import java.util.*;

public class _4_If_Else_if_Else {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter num 1:");
        int a = sc.nextInt();
        System.out.print("Enter num 2:");
        int b = sc.nextInt();

        System.out.print("Enter: 1 for addition\n\t   2 for subtraction\n-->");
        int choose = sc.nextInt();

        if(choose==1){
            System.out.println(a+b);
        }
        else if (choose==2) {
            System.out.println(a-b);
        }
        else{
            System.out.println("Invalid Input");
        }
    }
}
