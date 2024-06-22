package com.company;

import java.util.*;

public class _25_Repeated_loop_logic {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("To Quit the program type '100'");
        System.out.println("Enter the numbers:");
        int inp;
        int pos = 0;
        int zero = 0;
        int neg = 0;
        do{
            inp = sc.nextInt();
            if(inp>0 && inp!=100){
                pos++;
            }
            if(inp<0){
                neg++;
            }
            if(inp==0){
                zero++;
            }
        }while(inp!=100);
        System.out.println("Positive: "+pos);
        System.out.println("Zeros: "+zero);
        System.out.println("Negative: "+neg);
    }
}
