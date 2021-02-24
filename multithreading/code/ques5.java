package com.intoductiontomultithreading;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class TaskExecution implements Runnable{
    @Override
    public void run() {
        System.out.println("\tStarted executing new task in a thread: "+Thread.currentThread().getName());
    }
}
public class ques5 {
    public static void main(String[] args){

        System.out.println("\tInside the main thread");

        System.out.println("\n\tCreating Executor Service\n");
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        Thread thread1 = new Thread(new TaskExecution());
        Thread thread2 = new Thread(new TaskExecution());
        thread1.start();
        thread2.start();
        try{
            thread1.join();
            thread2.join();
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        System.out.println("\tSubmitting the tasks for execution...");

        executorService.submit(thread1);
        executorService.submit(thread2);

        System.out.println("\n\tShut down using shutdown()");
        executorService.shutdown();

        System.out.println("\n\tAll tasks terminated: "+ executorService.isTerminated());
        System.out.println("\n\tExecutorService is shutdown: "+ executorService.isShutdown());

    }
}
