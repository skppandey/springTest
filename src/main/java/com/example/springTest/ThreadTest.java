package com.example.springTest;

import lombok.SneakyThrows;

public class ThreadTest implements Runnable{
  PrintTable t;
  public ThreadTest(PrintTable t){
    this.t = t;
  }
  @SneakyThrows
  @Override
  public void run() {
    t.Print(5);
//    Thread.sleep(500);
  }
}
