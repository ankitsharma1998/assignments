package com.introductiontojava2;
import java.util.Scanner;
public class Ques8 {

    static void usingWhile(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = scan.next();
        while(!word.equals("done")) {
            if(word.charAt(0) == word.charAt(word.length() - 1)){
                System.out.println("First and last character are equals for the word: " + word);
            }
            else{
                System.out.println("First and last character are NOT equals for the word: " + word);
            }
            word = scan.next();
        }
    }

    static void usingDoWhile(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = scan.next();
        do {
            if(word.charAt(0) == word.charAt(word.length() - 1)){
                System.out.println("First and last character are equals for the word: " + word);
            }
            else{
                System.out.println("First and last character are NOT equals for the word: " + word);
            }
            word = scan.next();
        }while(!word.equals("done"));
    }

    public static void main(String[] args){
        System.out.println("Using while loop: ");
        Ques8.usingWhile();

        System.out.println("Using do-while loop: ");
        Ques8.usingDoWhile();
    }
}
