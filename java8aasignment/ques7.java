package com.introductiontojava8;
interface inter7 {
    public default void display(){
        System.out.println("Inside interface");
    }
}
public class ques7 implements inter7{
    @Override
    public void display() {
        System.out.println("Default function is overridden");
    }
    public static void main(String[] args) {
        ques7 q7 = new ques7();
        q7.display();
    }
}
