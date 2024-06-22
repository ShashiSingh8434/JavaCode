package com.company;

public class _13_Floyds_Triangle {
    public static void main(String[] args){
        int row = 5;
        int col = 5;
        int alpha = 1;

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(alpha+" ");
                alpha++;
            }
            System.out.println();
        }
    }
}
