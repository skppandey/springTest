package com.example.springTest;

import lombok.SneakyThrows;

public class OddEvenExample implements Runnable{
  private String taskName;
//public OddEvenExample(String taskName){
//  this.taskName = taskName;
//}
  @SneakyThrows
  @Override
  public void run() {
    System.out.println("Thread is Started : " + Thread.currentThread().getName());
    Thread.sleep(10000);
    System.out.println("Thread is stopping : " +Thread.currentThread().getName());

  }
}
