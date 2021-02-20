package com.introductiontojava8;
@FunctionalInterface
interface AddTwo
{
    int add(int a, int b);
}
public class ques2 {
    public static void main(String[] args) {
        int a = 36, b=48;
        AddTwo at = (int x, int y) -> x+y;
        int res = at.add(a,b);
        System.out.println("Result: " + res);
    }
}
