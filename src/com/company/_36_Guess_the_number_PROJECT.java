package com.company;

import java.util.Random;
import java.util.Scanner;

class Game{
    public int randNum(){
        Random rand = new Random();
        return rand.nextInt((100-1))+1;
    }
    public int takeInput(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your guess: ");
        return sc.nextInt();
    }
    public boolean isCorrectGuess(int comp,int user){
        return comp == user;
    }
}

public class _36_Guess_the_number_PROJECT {
    public static void main(String[] args) {
        Game alpha = new Game();

        int compGuess = alpha.randNum();
//        System.out.println(compGuess);

        System.out.println("Welcome! Game Starting");
        int score = 0;
        do {
            score++;
        }while (!alpha.isCorrectGuess(compGuess,alpha.takeInput()));
        System.out.println("Congrats! You Won");
        System.out.println("Your Score is "+score);
    }
}