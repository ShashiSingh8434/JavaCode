package com.company;
import java.util.*;

public class _20_Function_Addition {
    public static int addition(int a,int b){
        System.out.println("Addition: "+(a+b));
        return 1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter num1: ");
        int a = sc.nextInt();

        System.out.print("Enter num2: ");
        int b = sc.nextInt();

        addition(a,b);
    }
}
