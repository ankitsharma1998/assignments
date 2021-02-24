package com.intoductiontomultithreading;

class running implements Runnable{
    @Override
    public void run() {
        for(int i=0;i<5;i++) {
            System.out.println("\t"+i);
            try{
                System.out.println("Slept for 1000 milliseconds");
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

public class ques2 {
    public static void main(String[] args){
        Thread thread1 = new Thread(new running());
        System.out.println("\tStarting Thread thread1");
        thread1.start();
        System.out.println("waiting for thread thread1");
        try {
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("\nthread thread1 has finished its job");
    }
}
