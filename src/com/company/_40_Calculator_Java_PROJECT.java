package com.company;

import java.util.Scanner;

/**
 * This Java class calculates the given expression by the user using BOD-MAS rule.
 */

public class _40_Calculator_Java_PROJECT {

    /**
     * This constructor just greets the user
     */

    _40_Calculator_Java_PROJECT(){
        System.out.println("Welcome, to the Java Calculator written by Shashi Singh");
    }

    /**
     * This function is used to take the expression as an input from user in form of String.
     * @return String
     */

    public static String getInput(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the expression: ");
        return sc.next();
    }

    /**
     * This function takes a String as argument then divide it in three parts term1 , operator , term2 and then put it in array of String and return it as an array.
     * Now these division of argument is done in consideration of BOD MAS rule.
     * Using this function we apply the priority order of the operator. {"/" , "*" , "-" , "+"} This is in descending order.
     * @param expression String
     * @return An array of String
     */

    public static String[] terms(String expression){
        String[] output = new String[3];
        String[] sample = {"+","-","*","/"};
        int[] index = new int[4];

        for (int i = 0; i < 4; i++) {
            index[i] = expression.indexOf(sample[i]);
        }

        if(index[3]!=(-1)){
            output[0] = expression.substring(0,index[3]);
            output[1] = "/";
            output[2] = expression.substring(index[3]+1);
        } else if (index[2]!=(-1)) {
            output[0] = expression.substring(0,index[2]);
            output[1] = "*";
            output[2] = expression.substring(index[2]+1);
        } else if (index[1]!=(-1)) {
            output[0] = expression.substring(0,index[1]);
            output[1] = "-";
            output[2] = expression.substring(index[1]+1);
        } else if (index[0]!=(-1)) {
            output[0] = expression.substring(0,index[0]);
            output[1] = "+";
            output[2] = expression.substring(index[0]+1);
        }else{
            System.out.println("Invalid");
        }

        return output;
    }

    /**
     *This function return false if the given argument <b>doesn't contains any operator</b> and vice-versa.
     * @param arg (arg is the string which is to be checked whether it contains operator or not)
     * @return boolean
     */

    public static boolean check(String arg){
        String[] sample = {"+","-","*","/"};
        boolean out = false;
        for(String i : sample){
            if (arg.contains(i)) {
                out = true;
                break;
            }
        }
        return out;
    }

    /**
     * This function uses recursion to make the expression which contains many operators integer parsable.
     * This assigns the terms in integer parsable form by using recursion.
     * @param num (term in form of strings)
     */

    public static void run(String[] num){
        if (check(num[0])) {
            num[0] = String.valueOf(calculate(terms(num[0])));
        }
        if (check(num[2])) {
            num[2] = String.valueOf(calculate(terms(num[2])));
        }
    }

    /**
     * This gives the final result of the given expression by user.
     * This function parse the strings in integer if it is not parsable run() function makes it parsable.
     * @param num (term in form of strings)
     * @return integer
     */

    public static int calculate(String[] num){
        run(num);
        switch (num[1]) {
            case "+" -> {
                return Integer.parseInt(num[0]) + Integer.parseInt(num[2]);
            }
            case "-" -> {
                return Integer.parseInt(num[0]) - Integer.parseInt(num[2]);
            }
            case "*" -> {
                return Integer.parseInt(num[0]) * Integer.parseInt(num[2]);
            }
            case "/" -> {
                return Integer.parseInt(num[0]) / Integer.parseInt(num[2]);
            }
            case null, default -> {
                System.out.println("Error");
                return 0;
            }
        }
    }

    /**
     * This is the main function
     * @param args input
     */
    public static void main(String[] args) {
        new _40_Calculator_Java_PROJECT();
        System.out.println("Result: "+calculate(terms(getInput())));
    }
}