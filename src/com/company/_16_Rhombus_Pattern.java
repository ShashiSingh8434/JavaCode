package com.company;

public class _16_Rhombus_Pattern {
    public static void main(String[] args){
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = (n-i); j >=1 ; j--) {
                System.out.print("  ");
            }
            for (int k = 1; k <= n; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
