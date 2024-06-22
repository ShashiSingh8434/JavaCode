package com.company;

import java.util.Scanner;

public class _39_Calculator_Advanced_Project {
    public static int menuPrint(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice:");
        System.out.print("""
                1. Addition
                2. Subtraction
                3. Multiplication
                4. Division
                5. Quit
                -->\s""");
        return sc.nextInt();
    }
    public static float takeInput1(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first number: ");
        return sc.nextFloat();
    }
    public static float takeInput2(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your second number: ");
        return sc.nextFloat();
    }
    public static float add(float a,float b){
        return a+b;
    }
    public static float sub(float a,float b){
        if(a>b){
            return a-b;
        }else{
            return b-a;
        }
    }
    public static float mul(float a,float b){
        return a*b;
    }
    public static float div(float a,float b){
        return a/b;
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to Advance Calculator!!!");
        boolean loop = true;
        while(loop){
            try{
                switch (menuPrint()){
                    case 1:
                        System.out.println(add(takeInput1(),takeInput2()));
                        break;
                    case 2:
                        System.out.println(sub(takeInput1(),takeInput2()));
                        break;
                    case 3:
                        System.out.println(mul(takeInput1(),takeInput2()));
                        break;
                    case 4:
                        System.out.println(div(takeInput1(),takeInput2()));
                        break;
                    case 5:
                        loop = false;
                        break;
                }
            }
            catch (Exception e){
                System.out.print("Error: ");
                System.out.println(e);
            }
        }
    }
}
