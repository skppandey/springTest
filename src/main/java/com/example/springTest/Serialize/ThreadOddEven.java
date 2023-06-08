package com.example.springTest.Serialize;

import lombok.SneakyThrows;

public class ThreadOddEven {
  int count = 1;

  void printEven() throws InterruptedException {
    int num = 10;
    synchronized (this) {
      while (count < num) {
        while(count % 2 == 1) {
          try {
            wait();
          }catch (InterruptedException e){
            e.printStackTrace();
          }
        }
        System.out.println(count);
        count++;
        notify();
      }

    }
  }
  void printOdd() throws InterruptedException {
    int num = 10;
    synchronized (this) {
      while (count < num ) {
        while (count % 2 == 0) {
          try {
            wait();
          }catch (InterruptedException e){
            e.printStackTrace();
          }
        }

        System.out.println(count);
        count++;
        notify();
      }

    }
  }

  public static void main(String args[]){

    Thread T1 = new Thread(new Runnable() {
      @SneakyThrows
      @Override
      public void run() {
        new ThreadOddEven().printOdd();
      }
    });

    Thread T2 = new Thread(new Runnable() {
      @SneakyThrows
      @Override
      public void run() {
        new ThreadOddEven().printEven();
      }
    });

    T1.start();
    T2.start();
  }
}
