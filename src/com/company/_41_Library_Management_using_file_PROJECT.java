package com.company;

import java.io.*;
import java.util.Objects;
import java.util.Scanner;

public class _41_Library_Management_using_file_PROJECT {
    public static boolean loop = true;
    public static String getBookName(){
        System.out.print("Enter the name of book: ");
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
    public static String getFileName(){
        System.out.print("Enter the filename: ");
        Scanner sc = new Scanner(System.in);
        return sc.next();
    }
    public static void create(String filename){
        File file = new File(filename);
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void write(String bookname,String filename,boolean append){
        try {
            FileWriter content = new FileWriter(filename,append);
            content.write(bookname + "\n");
            content.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void read(String filename){
        try {
            File file = new File(filename);
            Scanner sc = new Scanner(file);
            while(sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
            sc.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    public static int menu(){
        System.out.println("Enter your choice:");
        System.out.println("1. Show all books");
        System.out.println("2. Show available books");
        System.out.println("3. Show borrowed books");
        System.out.println("4. Add book");
        System.out.println("5. Remove books");
        System.out.println("6. Borrow book");
        System.out.println("7. Return books");
        System.out.println("8. Quit");

        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
    public static void showAll(){
        read("Record.txt");
    }
    public static void showAvailable(){
        read("Available.txt");
    }
    public static void showBorrowed(){
        read("Borrowed.txt");
    }
    public static void addBook(String bookname){
        write(bookname,"Record.txt",true);
        write(bookname,"Available.txt",true);
    }
    public static String fileToString(String filename) throws FileNotFoundException {
        StringBuffer sb = new StringBuffer() ;
        Scanner sc = new Scanner(new File(filename));
        while(sc.hasNextLine()){
            sb.append(sc.nextLine());
            sb.append(" | ");
        }
        return sb.toString();
    }
    public static void removeBook(String bookname, String filename) throws FileNotFoundException {
        String content = fileToString(filename);
        content = content.replace(bookname,"");
        content = content.replace(" | ","\n");
        write(content,filename,false);
    }
    public static void deleteBook(String bookname) throws FileNotFoundException {
        String[] file = {"Record.txt","Available.txt","Borrowed.txt"};
        for (String s : file) {
            String content = fileToString(s);
            content = content.replace(bookname,"");
            content = content.replace(" | ","\n");
            write(content,s,false);
        }
    }
    public static void borrowBook(String bookname) throws FileNotFoundException {
        removeBook(bookname,"Available.txt");
        write(bookname,"Borrowed.txt",true);
    }
    public static void returnBook(String bookname) throws FileNotFoundException {
        removeBook(bookname,"Borrowed.txt");
        write(bookname,"Available.txt",true);
    }
    public static void lineCheckUp() throws FileNotFoundException {
        String[] file = {"Record.txt","Available.txt","Borrowed.txt"};
        for (String s : file) {
            String content = fileToString(s);
            content = content.replace(" |  |  | "," | ");
            content = content.replace(" |  | "," | ");
            content = content.replace(" | ","\n");
            write(content,s,false);
        }
    }
    public static void backend(int choice){
        switch (choice){
            case 1:
                showAll();
                break;
            case 2:
                showAvailable();
                break;
            case 3:
                showBorrowed();
                break;
            case 4:
                addBook(getBookName());
                break;
            case 5:
                try {
                    deleteBook(getBookName());
                } catch (FileNotFoundException e) {
                    throw new RuntimeException(e);
                }
                break;
            case 6:
                try {
                    borrowBook(getBookName());
                } catch (FileNotFoundException e) {
                    throw new RuntimeException(e);
                }
                break;
            case 7:
                try {
                    returnBook(getBookName());
                } catch (FileNotFoundException e) {
                    throw new RuntimeException(e);
                }
                break;
            case 8:
                loop = false;
                break;
            default:
                System.out.println("Invalid Input");
        }
    }
    public static void run() throws FileNotFoundException {
        backend(menu());
        lineCheckUp();
    }
    public static void main(String[] args) throws FileNotFoundException {
        create("Record.txt");
        create("Available.txt");
        create("Borrowed.txt");
        while(loop){
            run();
//            Here have to add something to make the program wait
        }
//        lineCheckUp();
    }
}
