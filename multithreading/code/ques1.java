package com.intoductiontomultithreading;

class ThreadClass extends Thread{
    @Override
    public void run() {
        System.out.println("Thread is being executed using thread class");
    }
}
class Usingrunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("Thread is being executed  using runnable interface");
    }
}
public class ques1 {
    public static void main(String[] args) {
        ThreadClass th = new ThreadClass();
        Usingrunnable inter = new Usingrunnable();
        Thread t1 = new Thread(inter);
        th.start();
        t1.start();
    }
}
