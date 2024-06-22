package com.company;

public class _10_Reverse_Pyramid {
    public static void main(String[] args){
        int row = 4;
        int col = 4;
        int a = col;
        for (int i = 1; i <= row ; i++) {
            for (int j = a; j >= 1 ; j--) {
                System.out.print("*");
            }
            a--;
            System.out.println();
        }
    }
}
