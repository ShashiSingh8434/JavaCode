package com.company;
import java.util.*;
// a+b a+b+2*b a+b+2*b+2*2*b
public class _29_Series_Problem {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter q:");
        int q = sc.nextInt();

        for (int i = 1; i <= q; i++) {
            System.out.println("Enter a, b, n:");
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();
            int out = a+b;
            int nex = 2*b;
            for (int j = 1; j <= n; j++) {
                System.out.print(out+" ");
                out = out+(nex);
                nex = nex*2;
            }
            System.out.println();
        }
    }
}
