package com.company;

import java.util.Scanner;

public class _33_Array_Practice {
    public static void main(String[] args) {
//        Question 1
//        float[] num = {1.2f,2.2f,3.3f,4.4f,5.5f};
//        float sum = 0;
//        for (int i = 0; i < num.length; i++) {
//            sum += num[i];
//        }
//        System.out.println(sum);

//        Question 2
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the number to match: ");
//        int match = sc.nextInt();
//        int[] arr = {0,1,2,3,4,5,6,7,8,9};
//        boolean result = false;
//        for (int i : arr) {
//            if(i == match){
//                result = true;
//            }
//        }
//        if(result){
//            System.out.println("Yes, it is present in the array");
//        }else{
//            System.out.println("No, it is not present.");
//        }

//        Question 3
//        int[][] arr1 = {{1,2,3},{4,5,6}};
//        int[][] arr2 = {{5,4,3},{2,1,0}};
//        int[][] sum = new int[2][3];
//        for (int i = 0; i < 2; i++) {
//            for (int j = 0; j < 3; j++) {
//                sum[i][j] = arr1[i][j] + arr2[i][j];
//                System.out.print(sum[i][j] + " ");
//            }
//            System.out.println();
//        }

//        Question 4
//        int[] arr = {2,4,6,8,10,12,14,16,18,20};
//        for (int i = 0; i < arr.length/2; i++) {
//            int a = arr[i];
//            arr[i] = arr[arr.length-1-i];
//            arr[arr.length-1-i] = a;
//        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }

//        Question 5
//        int[] arr = {2,4,6,8,10,12,14,16,18,20};
//        int greatest = 0;
//        for(int i : arr){
//            if(i>greatest){
//                greatest = i;
//            }
//        }
//        System.out.println(greatest);

//        Question 6
//        int[] arr = {2,4,6,8,10,-12,14,16,18,20};
//        int smallest = arr[0];
//        for(int i : arr){
//            if(i<smallest){
//                smallest = i;
//            }
//        }
//        System.out.println(smallest);

//        Question 7
        int[] arr = {1,2,5,8,10,5};
        boolean res = true;
        if(arr[0]>arr[1]){
            for (int i = 1; i < arr.length; i++) {
                if(arr[i]>arr[i-1]){
                    res = false;
                    break;
                }

            }
        } else{
            for (int i = 1; i < arr.length; i++) {
                if(arr[i]<arr[i-1]){
                    res = false;
                    break;
                }
            }
        }
        System.out.println(res);
    }
}
