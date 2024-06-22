package com.company;

public class _27_HCF_Finder {
    public static void hcfFinder(int a,int b){
        int numer = a;
        int denom = b;
        int rem = 12;
        while(rem!=0){
            rem = numer%denom;
            if(rem!=0){
                numer = denom;
                denom = rem;
            }
        }
        System.out.println(denom);
    }
    public static void main(String[] args){
        int a = 15;
        int b = 9;
        hcfFinder(a,b);
    }
}
