package com.intoductiontomultithreading;

import java.util.concurrent.atomic.AtomicInteger;

class Atomict extends Thread{
    AtomicInteger count = new AtomicInteger(0);

    @Override
    public void run(){
        int max = 1_000_00_000;
        for(int i=0;i<max;i++){
            count.addAndGet(1);
        }
    }
}
public class ques12 {
    public static void main(String[] args)throws InterruptedException  {
        Atomict at = new Atomict();
        Thread first = new Thread(at, "first");
        Thread second = new Thread(at, "second");
        first.start();
        second.start();
        first.join();
        second.join();
        System.out.println(at.count);
    }
}
