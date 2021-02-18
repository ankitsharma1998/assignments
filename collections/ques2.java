package com.introductiontocollections;

import java.util.HashSet;
import java.util.Scanner;

public class ques2 {
    //method that takes a string and returns the number of unique characters in the string.
    public static int uniqueChar(String str){
        char[] ch_array = str.toCharArray(); //creating a char array from the string
        HashSet<Character> charSet = new HashSet<Character>();
        for(char ch:ch_array){   // putting the elements of char array into the HashSet Collection,
            charSet.add(ch);     // as it will contain unique objects only. No object is repeated in it.
        }
        return charSet.size();
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter some text:");
        String input = scan.nextLine();
        System.out.println("Number of unique characters in string are: "+uniqueChar(input));
    }
}
