package com.introductiontojava8;

@FunctionalInterface
interface IncreaseByOne
{
    int calculate(int x);
}
public class ques1_2 {
    public static void main(String[] args) {
        int a = 10;
        IncreaseByOne ib = (int x) -> x+1;
        System.out.println("Result is: " + ib.calculate(a));
    }
}
