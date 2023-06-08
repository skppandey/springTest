package com.example.springTest;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public class PrintTable {
//  private final AtomicReference<Integer> value = new AtomicReference<>();
  synchronized void Print(int n) throws InterruptedException {
      for (int i = 0; i < 5; i++) {
//        value.set(n*i);
        System.out.println(n*i);
        Thread.sleep(500);
      }
    }
}
