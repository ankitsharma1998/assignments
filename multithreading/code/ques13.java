package com.intoductiontomultithreading;

public class ques13 {
    public void doWork(){
        Thread t1 = new Thread(() -> {
            synchronized (this){
                System.out.println(Thread.currentThread().getName() + " running.. \n");
                System.out.println("start is waiting for others to complete");
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("\nResumed "+Thread.currentThread().getName());
            }
        });

        Thread t2 = new Thread(() ->{
            synchronized (this){
                System.out.println(Thread.currentThread().getName() + " running... \n");
                System.out.println("Sleeping for 200 milliseconds");
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                notify();
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args){
        ques13 obj = new ques13();
        obj.doWork();
        System.out.println("\nEnd of Program");
    }
}
