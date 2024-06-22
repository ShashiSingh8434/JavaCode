package com.company;

public class _23_Sum_of_odd {
    public static int oddSum(int n){
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if(i%2!=0){
                sum = sum+i;
            }
        }
        System.out.println(sum);
        return 1;
    }
    public static void main(String[] args){
        int n = 7;
        oddSum(n);
    }
}
