package com.example.springTest.PC;

import com.example.springTest.Singleton;

public class ThreadExecuter {
  static final PC pc = Singleton.getInstance();
  public void execute() throws InterruptedException {
    ProducerThread prod = new ProducerThread(pc);
    Thread pt = new Thread(prod);

    ConsumerThread cons = new ConsumerThread(pc);
    Thread ct = new Thread(cons);

    pt.start();
    ct.start();

    pt.join();
    ct.join();
  }
}
