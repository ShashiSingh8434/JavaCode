package com.company;

public class _12_Number_Pyramid {
    public static void main(String[] args){
        int row = 5;
        int col = 5;

//        ------------------------------------
//        for (int i = 1; i <= row; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(j);
//            }
//            System.out.println();
//        }

//        ------------------------------------

        for (int i = row; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
