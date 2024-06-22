package com.company;

public class _14_0_1_Pyramid {
    public static void main(String[] args) {
        int row = 5;
        int col = 5;

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                int sum = i+j;
                if(sum%2==0){
                    System.out.print("1 ");
                }else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}