package com.example.springTest.FutureTest.callable;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableLambda {
  public static void main(String[] args) throws ExecutionException, InterruptedException {
    ExecutorService executorService = Executors.newFixedThreadPool(5);
    Future[] futureResult = new Future[5];
for (int i=0;i<5;i++) {
  Callable callable = () -> {
    Random generator = new Random();
    Integer randomNumber = generator.nextInt(5);
    Thread.sleep(randomNumber * 1000);
    return randomNumber;
  };

  futureResult[i] = executorService.submit(callable);
}
for (int i=0;i<5;i++){
  System.out.println(futureResult[i].get());
}
  }
}
