package com.example.springTest.FutureTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CallableWithFutureTask {
  public static void main(String[] args) throws ExecutionException, InterruptedException {
    List<FutureTask> futureTaskList = new ArrayList<>();
    for (int i=0;i<5;i++){
      Callable callable = () -> {
        Random generator = new Random();
        Integer randomNum = generator.nextInt();
        Thread.sleep(1000);
        return randomNum;
      };
      FutureTask futureTask = new FutureTask<>(callable);
      futureTaskList.add(futureTask);
      Thread t = new Thread(futureTask);
      t.start();
    }
    for (FutureTask f : futureTaskList){
      System.out.println(f.get());
    }
  }
}
