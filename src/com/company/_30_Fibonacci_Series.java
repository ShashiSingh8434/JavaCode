package com.company;

public class _30_Fibonacci_Series {
    public static void main(String[] args){
        int n = 7;
        int num = 0;
        System.out.print(num+" ");
        num++;
        System.out.print(num+" ");
        int numpp = 0;
        int nump = 1;
        for (int i = 3; i <= n; i++) {
            System.out.print(num+" ");
            numpp = nump;
            nump = num;
            num = numpp + nump;
        }
    }
}
