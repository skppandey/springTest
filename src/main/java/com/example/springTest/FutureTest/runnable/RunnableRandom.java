package com.example.springTest.FutureTest.runnable;

import java.util.Random;

public class RunnableRandom implements Runnable{
  private static Integer randomNumber;
  @Override
  public void run() {
    Random generator = new Random();
    Integer randomNum = generator.nextInt(5);
    randomNumber = randomNum;
    try {
      Thread.sleep(randomNum*1000);
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }
    synchronized(this)
    {
      notifyAll();
    }
  }
  public synchronized Integer get() throws InterruptedException {
    while(randomNumber == null){
      wait();
    }
    return randomNumber;
  }
}
