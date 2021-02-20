package com.introductiontojava8;
@FunctionalInterface
interface ConcactStrs
{
    String concactStr(String s1, String s2);
}

public class ques1_3 {
    public static void main(String[] args) {
        String s1 = "First string";
        String s2 = " Second String";
        ConcactStrs cs = (String a, String b) -> a.concat(b);
        String res = cs.concactStr(s1, s2);
        System.out.println("result is: " + res);
    }
}

