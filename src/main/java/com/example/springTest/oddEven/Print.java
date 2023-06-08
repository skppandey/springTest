package com.example.springTest.oddEven;

public class Print{
  public static void main(String[] args) {

    PrintEvenOdd print = new PrintEvenOdd();

    Thread even = new Thread(()->{
      try {
        print.printEven();
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
    });

    Thread odd = new Thread(()->{
      try {
        print.printOdd();
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
    });

    even.start();
    odd.start();
  }
}
