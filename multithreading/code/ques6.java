package com.intoductiontomultithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class FutureSquare implements Callable<Double>{
    private final double number;
    FutureSquare(double number){
        this.number=number;
    }
    public Double call() throws Exception {
        System.out.println("Calculating Square with "+Thread.currentThread().getName());
        Thread.sleep(2000);
        return number*number;
    }
}

public class ques6 {
    public static void main(String[] args){
        ExecutorService executorservice = Executors.newSingleThreadExecutor();
        FutureSquare obj = new FutureSquare(13);
        Future<Double> future_obj = executorservice.submit(obj);
        try {
            System.out.println("Square of " + 13 + " : " + future_obj.get());
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("Is this squaring task done : "+future_obj.isDone());
        System.out.println("Is this squaring task cancelled : "+future_obj.isCancelled());
        executorservice.shutdown();

    }
}
