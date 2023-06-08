package com.example.springTest.PC;

import java.util.LinkedList;

public class PC {
  LinkedList<Integer> list = new LinkedList<>();
  int Capacity = 2;
  public void Produce() throws InterruptedException {
    int value = 0;

    while(true) {
      synchronized (this) {
        if(list.size() == Capacity)
          wait();

        System.out.println("Producer produced-"
                  + value);
        // to insert the jobs in the list
        list.add(value++);
        // notifies the consumer thread that
        // now it can start consuming
        notify();
        // makes the working of program easier
        // to  understand
        Thread.sleep(1000);
      }
    }
  }

  public void Consume() throws InterruptedException {

    while(true){
      synchronized (this){
        if(list.isEmpty())
          wait();

        int val = list.removeFirst();
        System.out.println("Consumer consumed-"
                + val);
        notify();
        Thread.sleep(1000);
      }
    }
  }
}
