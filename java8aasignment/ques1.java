package com.introductiontojava8;

@FunctionalInterface
interface FirstGreater
{
    boolean calculate(int fn, int sn);
}
public class ques1 {
    public static void main(String[] args) {
        int a=5,b=9;
        FirstGreater fs = (int x, int y) -> x>y? true: false;
        boolean res = fs.calculate(a,b);
        System.out.println(res);
    }
}
