package com.introductiontojava2;

class MyException extends Exception{
    private boolean suppressStacktrace = false;

    public MyException(String s,boolean suppressStacktrace){
        super(s,null,suppressStacktrace, !suppressStacktrace);
        this.suppressStacktrace = suppressStacktrace;
    }
    public String toString() {
        if (suppressStacktrace) {
            return getLocalizedMessage();
        } else {
            return super.toString();
        }
    }
}

public class Ques13 {
    public static void main(String[] args) throws MyException{
        try {
            throw new MyException("Caught an exception without stack trace", true);
        } catch (MyException e) {
            e.printStackTrace();
        }
    }
}
