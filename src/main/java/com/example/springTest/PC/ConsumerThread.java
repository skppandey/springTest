package com.example.springTest.PC;

import lombok.SneakyThrows;

public class ConsumerThread implements Runnable{
  PC pc;
  public ConsumerThread(PC pc){
    this.pc = pc;
  }
  @SneakyThrows
  @Override
  public void run() {
    try {
      pc.Consume();
    }catch (InterruptedException e) {
      e.printStackTrace();
    }

  }
}
