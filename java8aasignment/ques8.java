package com.introductiontojava8;

interface Programmer{
    public default void code(){
        System.out.println("I love coding in java");
    }
}
interface Gamer{
    public default void games(){
        System.out.println("i love to travel and explore");
    }
}
public class ques8 implements Programmer,Gamer {
    public static void main(String[] args) {
        ques8 carrier = new ques8();
        System.out.println("Multiple inheritance through interface");
        carrier.code();
        carrier.games();
    }
}
