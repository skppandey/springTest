package com.example.springTest.FutureTest.callable;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableWithFuture {
  public static void main(String[] args) throws ExecutionException, InterruptedException {
    List<Future> futureList = new ArrayList<>();
    ExecutorService executorService = Executors.newFixedThreadPool(5);
    for(int i=0;i<5;i++) {
      CallableClass randomNumbers = new CallableClass();
      Future future = executorService.submit(randomNumbers);
      futureList.add(future);
    }

    for(Future f : futureList){
      System.out.println(f.get());
    }
  }
}
