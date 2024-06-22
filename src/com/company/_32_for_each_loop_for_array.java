package com.company;

public class _32_for_each_loop_for_array {
    public static void main(String[] args) {
//        int[] mark = {1,2,3,4,5,6};
        String[] mark = new String[5];
        mark[0] = "1";
        mark[1] = "2";
        mark[2] = "3";
        for(String i : mark ){
            if(i != null) {
                System.out.println(i);
            }
        }
    }
}
