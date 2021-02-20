package com.introductiontojava8;

interface MyCustomInterface{
    public default void display(){
        System.out.println("this is default method");
    }
    public static void staticMethod(){
        System.out.println("this is static method");
    }
}
public class ques6 implements MyCustomInterface {
    public static void main(String[] args) {
        ques6 inter = new ques6();
        inter.display();
        MyCustomInterface.staticMethod();
    }
}
