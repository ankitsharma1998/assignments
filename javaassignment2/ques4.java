package com.introductiontojava2;
class Single{
    private static Single single_instance = null;
    public String str;
    private Single()
    {
        str = "This is private constructor";
    }
    public static Single getInstance()
    {
        if(single_instance == null)
        {
            single_instance = new Single();
        }
        return single_instance;
    }
}
public class ques4 {
    public static void main(String[] args) {
        Single a = Single.getInstance();
        Single b = Single.getInstance();
        Single c = Single.getInstance();

        a.str = (a.str).toUpperCase();
        System.out.println("b: " + b.str);
        System.out.println("c: " + c.str);

        a.str = (a.str).toLowerCase();
        System.out.println("b: " + b.str);
        System.out.println("c: " + c.str);
    }
}