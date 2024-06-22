package com.company;

public class _18_Palindromic_Pattern {
    public static void main(String[] args){
        int n = 9;
        for (int i = 1; i <= n; i++) {
            for (int j = (n-i); j >=1 ; j--) {
                System.out.print("  ");
            }
            int a = i;
            for (int j = 1; j <= i; j++) {
                System.out.print(a+" ");
                a--;
            }
            a = a+2;

            for (int j = 2; j <= i; j++) {
                System.out.print(a+" ");
                a++;
            }
            System.out.println();
        }
    }
}
