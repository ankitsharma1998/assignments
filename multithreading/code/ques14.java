package com.intoductiontomultithreading;

public class ques14 {
    public synchronized void waitMethod(){
        System.out.println(Thread.currentThread().getName() + " running... \n");
        System.out.println("Start waiting for the Thread2 to start and complete its work");
        try {
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("\nResumed "+Thread.currentThread().getName());
    }

    public void doWork(){
        Thread t1 = new Thread(this::waitMethod);

        Thread t2 = new Thread(this::waitMethod);

        Thread t3 = new Thread(() ->{
            synchronized (this){
                System.out.println(Thread.currentThread().getName() + " running... \n");
                System.out.println("Sleeping for 100 milliseconds");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Notifying threads that thread 2 has finished its work");
                notifyAll();
            }
        });

        t1.start();
        t2.start();
        t3.start();

        try {
            t1.join();
            t2.join();
            t3.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }

    public static void main(String[] args){
        ques14 obj = new ques14();
        obj.doWork();
        System.out.println("\nEnd of Program");
    }
}
