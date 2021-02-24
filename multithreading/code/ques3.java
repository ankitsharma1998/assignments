package com.intoductiontomultithreading;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ques3 {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        RunThreads r1 = new RunThreads();
        RunThreads r2 = new RunThreads();
        executor.submit(r1);
        executor.submit(r2);
        executor.shutdown();
    }
}
class RunThreads implements Runnable{
    @Override
    public void run() {
        Thread t = new Thread();
        for (int i=0;i<5;i++){
            try {
                Thread.sleep(300);
            }catch (Exception e){
                System.out.println(e);
            }
            System.out.println(t.getName());
        }
    }
}

