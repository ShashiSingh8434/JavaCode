package com.company;

public class _15_Butterfly_Pattern {
    public static void main(String[] args){
        int n = 10;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            for (int j = (n-i); j >= 1; j--) {
                System.out.print("  ");
            }
            for (int j = (n-i); j >= 1; j--) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print("* ");
            }
            for (int j = (n-i); j >= 1; j--) {
                System.out.print("  ");
            }
            for (int j = (n-i); j >= 1; j--) {
                System.out.print("  ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
