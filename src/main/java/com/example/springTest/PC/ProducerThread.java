package com.example.springTest.PC;

import lombok.SneakyThrows;

public class ProducerThread implements Runnable {
  PC pc;
  public ProducerThread(PC pc){
    this.pc = pc;
  }
  @SneakyThrows
  @Override
  public void run() {
    pc.Produce();
  }
  }

