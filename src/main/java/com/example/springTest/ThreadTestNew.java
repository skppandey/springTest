package com.example.springTest;

import lombok.SneakyThrows;

public class ThreadTestNew implements Runnable{
  PrintTable t;
  public ThreadTestNew(PrintTable t){
    this.t = t;
  }
  @SneakyThrows
  @Override
  public void run() {
    t.Print(100);
//    Thread.sleep(500);
  }
}
