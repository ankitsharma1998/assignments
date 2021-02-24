package com.intoductiontomultithreading;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ques15 {

    Lock lock = new ReentrantLock();
    Condition condition = lock.newCondition();

    public synchronized void waitMethod(){
        System.out.println(Thread.currentThread().getName() + " running... \n");
        lock.lock();
        System.out.println("Start waiting for the other threads to start and complete its work");
        try {
            condition.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
        System.out.println("\nResumed "+Thread.currentThread().getName());
    }

    public void doWork(){

        Thread t1 = new Thread(this::waitMethod);

        Thread t2 = new Thread(this::waitMethod);

        Thread t3 = new Thread(() ->{
            System.out.println(Thread.currentThread().getName() + " running... \n");
            try{
                Thread.sleep(50);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            lock.lock();
            System.out.println("Signal one thread that thread 2 has finished its work");
            condition.signal();
            lock.unlock();
        });

        Thread t4 = new Thread(() ->{
            System.out.println(Thread.currentThread().getName() + " running... \n");
            try{
                Thread.sleep(100);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            lock.lock();
            System.out.println("Signal all the threads that thread 3 has finished its work");
            condition.signalAll();
            lock.unlock();
        });


        t1.start();
        t2.start();
        t3.start();
        t4.start();
        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args){
        ques15 obj = new ques15();
        obj.doWork();
        System.out.println("\nEnd of Program");
    }
}
