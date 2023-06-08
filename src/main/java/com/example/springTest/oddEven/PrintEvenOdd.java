package com.example.springTest.oddEven;

public class PrintEvenOdd {
  private static Integer number = 0;
  private static Integer counter = 20;
  public void printEven() throws InterruptedException {
    synchronized (this) {
      while(number < counter) {
        while (number % 2 != 0) {
          wait();
        }
        System.out.println("Even Number : " + number);
        number++;
        notify();
      }
    }

  }

  public void printOdd() throws InterruptedException {
    synchronized (this) {
      while(number < counter) {
        while (number % 2 == 0) {
          wait();
        }
        System.out.println("Odd Number : " + number);
        number++;
        notify();
      }
    }

  }
}
