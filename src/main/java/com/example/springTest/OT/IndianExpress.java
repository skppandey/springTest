package com.example.springTest.OT;

public class IndianExpress implements Runnable{
  private String name;

  public IndianExpress(String name) {
    this.name = name;
  }

  @Override
  public void run() {
    read(name);
    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }
  }

  public void read(String name){
    System.out.println("Customer:" + name);
  }

}
