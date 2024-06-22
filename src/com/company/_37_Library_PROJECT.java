package com.company;

import java.util.Objects;

class Library{
    public String[] listOfBooks = new String[100];
    public String[] borrowedBooks = new String[100];

    public int numOfBooks = 0;
    public int numOfBorrowedBooks = 0;

    void assigningBooks(){
        listOfBooks[0] = "DG";
        listOfBooks[1] = "Good Ending";
        listOfBooks[2] = "Berserk";
        listOfBooks[3] = "One Piece";
        listOfBooks[4] = "Naruto";
    }
    int getNumOfAvailBooks(){
        numOfBooks = 0;
        for(String a : listOfBooks){
            boolean print = true;
            if(a != null) {
                for (int i = 0; i < getNumOfBorrowedBooks(); i++) {
                    if(Objects.equals(borrowedBooks[i], a)){
                        print = false;
                    }
                }
                if(print){
                    numOfBooks++;
                }
            }
        }
        return numOfBooks;
    }
    int getNumOfBorrowedBooks(){
        numOfBorrowedBooks = 0;
        for(String i : borrowedBooks){
            if(i != null) {
                numOfBorrowedBooks++;
            }
        }
        return numOfBorrowedBooks;
    }
    void showAvailableBook(){
        System.out.println("Displaying all the available books: ");
        for(String a : listOfBooks){
            boolean print = true;
            if(a != null) {
                for (int i = 0; i < getNumOfBorrowedBooks(); i++) {
                    if(Objects.equals(borrowedBooks[i], a)){
                        print = false;
                    }
                }
                if(print){
                    System.out.println(a);
                }
            }
        }
        System.out.println("-----");
    }
    void addNewBook(String name){
        System.out.println("Adding new book: "+name);
        listOfBooks[getNumOfAvailBooks()] = name;
    }
    void borrowBook(String name){
        for(String i : listOfBooks){
            if(Objects.equals(name, i)){
                System.out.println("Borrowed book: "+name);
                borrowedBooks[getNumOfBorrowedBooks()] = name;
            }
        }
    }
    void returnBook(String name){
        int a = 0;
        for(String i : borrowedBooks){
            if(Objects.equals(name, i)){
                borrowedBooks[a] = null;
                System.out.println("Returning Book: " + name);
            }
            a++;
        }
    }
}
public class _37_Library_PROJECT {
    public static void main(String[] args) {
        Library user = new Library();
        user.assigningBooks();
        user.addNewBook("Vagabond");
        user.showAvailableBook();
        user.borrowBook("Berserk");

        user.showAvailableBook();
        System.out.println(user.getNumOfBorrowedBooks());
        System.out.println(user.getNumOfAvailBooks());
        user.returnBook("Berserk");
        user.showAvailableBook();
        System.out.println(user.getNumOfBorrowedBooks());
        System.out.println(user.getNumOfAvailBooks());
    }
}