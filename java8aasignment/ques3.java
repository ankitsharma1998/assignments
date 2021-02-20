package com.introductiontojava8;
interface Add{
    int add(int a, int b);
}
interface Subtract{
    int sub(int a, int b);
}
interface Multiply{
    int mul(int a, int b);
}
public class ques3 {
    public int addReference(int x, int y) {
        return x + y;
    }
    public int subReference(int x, int y){
        return x - y;
    }
    public static int mulReference(int x, int y) {
        return x * y;
    }
    public static void main(String[] args) {
        int a=88,b=6;
        Add ad = new ques3()::addReference;
        Subtract sb = new ques3()::subReference;
        Multiply m = ques3::mulReference;
        System.out.println("Add instance method: " + ad.add(a,b));
        System.out.println("Subtract instance method: " + sb.sub(a,b));
        System.out.println("multiply static method: " + m.mul(a,b));
    }
}
