package com.company;

public class _26_Exponential_Problem {
    public static void powerFunction(int a,int b){
        int res = 1;
        for (int i = 1; i <= b; i++) {
            res = res*a;
        }
        System.out.println(res);
    }
    public static void main(String[] args){
        int a = 13;
        int b = 2;
        powerFunction(a,b);
    }
}
