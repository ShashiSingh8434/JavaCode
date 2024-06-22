package com.company;

public class _34_Methods_Practice {
//    Question 1
//    static void mulTable(int n){
//        for (int i = 1; i <= 10; i++) {
//            System.out.println(n+" X "+i+" = "+n*i);
//        }
//    }
//    public static void main(String[] args) {
//        mulTable(3);
//    }

//    Question 2
//    static void starPrint(int n){
//        String star = "* ";
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(star);
//            }
//            System.out.println();
//        }
//    }
//    public static void main(String[] args) {
//        starPrint(10);
//    }

//    Question 3
//    static int sum(int n){
//        if(n==1){
//            return 1;
//        }
//        return n + sum(n-1);
//    }
//    public static void main(String[] args) {
//        System.out.println(sum(6));
//    }

//    Question 4
///    static int fibSeries(int n){
//        if(n == 1){
//            return 0;
//        }
//        else if(n == 2){
//            return 1;
//        }
//        else {
//            return fibSeries(n-2) + fibSeries(n-1);
//        }
//    }
///    public static void main(String[] args) {
//        System.out.println(fibSeries(4));
//    }

//    Question 5
    static int avg(int n,int ...arr){
        int sum = n;
        for(int a:arr){
            sum += a;
        }
        return sum/(arr.length+1);
    }
    public static void main(String[] args) {
        System.out.println(avg(1,2,3,4,5,6,7));
    }
}
