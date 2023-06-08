package com.example.springTest.FutureTest.callable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CallableExample {
  public static void main(String[] args) throws ExecutionException, InterruptedException {
    FutureTask[] futureTasks = new FutureTask[5];
    for(int i=0;i<5;i++){
      CallableClass callableClass = new CallableClass();
      futureTasks[i] = new FutureTask(callableClass);
      Thread t = new Thread(futureTasks[i]);
      t.start();
    }
    for (int i = 0; i < 5; i++){
      System.out.println(futureTasks[i].get());
    }
  }
}
