package com.company;
import java.util.*;

public class _28_Array_ {
    public static void main(String[] args){

//        1D array declaration formats:
//        int[] arr = new int[(size)];

//        2D array declaration formats:
//        int[][] num = new int[row][col];

//        int arr[] = {2,3,5,1,0,5,7,8,7};
//        int n = 7;
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i]==n){
//                System.out.println(i);
//            }
//        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows and columns:");
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] mat = new int[rows][cols];
        System.out.println("Enter the matrix: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.print("Enter the number to find: ");
        int n = sc.nextInt();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if(mat[i][j]==n){
                    System.out.println("Row: "+(i+1));
                    System.out.println("Columns: "+(j+1));
                }
            }
        }
    }
}
