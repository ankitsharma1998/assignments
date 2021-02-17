package com.introductiontojava2;

import java.util.Scanner;

public class ques7 {
    static void ConvertToDay(int seconds)
    {
        int day = seconds / (24 * 3600);

        int hour = (seconds % (24*3600)) / 3600;

        int minutes = (seconds % 3600) / 60 ;

        int second = seconds % 60;

        System.out.println( day + " days " + hour + " hours " + minutes + " minutes " + second + " seconds ");
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter seconds to convert into days: ");
        int seconds = scan.nextInt();
        ConvertToDay(seconds);
    }
}