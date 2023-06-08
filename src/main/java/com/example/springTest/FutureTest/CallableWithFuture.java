package com.example.springTest.FutureTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableWithFuture {
  public static void main(String[] args) throws ExecutionException, InterruptedException {
    ExecutorService executorService = Executors.newFixedThreadPool(2);
    List<Future> futureList = new ArrayList<>();
    for (int i=0;i<5;i++){
      Callable callable = () -> {
        Random generator = new Random();
        Integer randomNum = generator.nextInt();
        Thread.sleep(1000);
        return randomNum;
      };
      Future future = executorService.submit(callable);
      futureList.add(future);
    }
    for (Future future : futureList){
        System.out.println(future.get());
    }
  }
}
