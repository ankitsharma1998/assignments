package com.introductiontojava8;
@FunctionalInterface
interface UpperCaseStr
{
    String upperCase(String s1);
}

public class ques1_4 {
    public static void main(String[] args) {
        String str = "string will be changed to uppercase";
        UpperCaseStr up = (String st) -> str.toUpperCase();
        String result = up.upperCase(str);
        System.out.println("result: " + result);
    }
}
