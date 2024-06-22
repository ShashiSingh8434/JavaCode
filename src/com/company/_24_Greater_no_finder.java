package com.company;

import java.util.*;

public class _24_Greater_no_finder {
    public static void greaterFinder(int a,int b,int c){
        if(a>b){
            if(a>c){
                System.out.println(a);
            }else {
                System.out.println(c);
            }
        }else{
            if(b>c){
                System.out.println(b);
            }else{
                System.out.println(c);
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        greaterFinder(a,b,c);
    }
}
