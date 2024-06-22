package com.company;

public class _31_Printing_in_Reverse {
    public static void main(String[] args) {
        int[] marks = {1,2,3,4,5};
        for (int i = marks.length-1; i >= 0 ; i--) {
            System.out.println(marks[i]);
        }
    }
}
