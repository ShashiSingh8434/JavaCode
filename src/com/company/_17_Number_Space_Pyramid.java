package com.company;

public class _17_Number_Space_Pyramid {
    public static void main(String[] args){
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = (n-i); j >=1 ; j--) {
                System.out.print(" ");
            }
            for (int j = (n-i+1); j <= ((n-i+1)+((2*i)-1)); j++) {
                if((i+j)%2==0){
                    System.out.print(i);
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
