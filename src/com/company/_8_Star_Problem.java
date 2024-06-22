package com.company;

public class _8_Star_Problem {
    public static void main(String[] args) {

//        -----------------------------------------------------------------------------
//        To print the below rectangle:
//        *****
//        *****
//        *****
//        *****

//        int b = 4;
//        int l = 5;
//        for (int i = 1; i <= b ; i++) {
//            for (int j = 1; j <= l; j++) {
//                System.out.print("*");
//            }
//            System.out.println();

//        ----------------------------------------------------------------------------
//        To print the below rectangle
//        *****
//        *   *
//        *   *
//        *****

        int l = 6;
        int b = 5;

        for (int i = 1; i <= b; i++) {
            if (i == 1 || i == b) {
                for (int j = 1; j <= l; j++) {
                    System.out.print("*");
                }
                System.out.println();

            } else {
                for (int j = 1; j <= l; j++) {
                    if (j == 1 || j == l) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }

//        ----------------------------------------------------------------------------

    }
}
