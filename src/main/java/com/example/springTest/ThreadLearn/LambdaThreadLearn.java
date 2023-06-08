package com.example.springTest.ThreadLearn;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class LambdaThreadLearn {

  public static void main(String args[]){
    new Thread(() ->{
      for(int i=0;i<5;i++){
        System.out.println("Child Thread using lambda" + i);
        try {
          Thread.sleep(500);
        } catch(Exception e) {
          e.printStackTrace();
        }
      }
    }).start();


    Runnable runnable = () -> {
      try {
        String name = Thread.currentThread().getName();
        System.out.println("Foo " + name);
        TimeUnit.SECONDS.sleep(1);
        System.out.println("Bar " + name);
      }
      catch (InterruptedException e) {
        e.printStackTrace();
      }
    };

    Thread thread1 = new Thread(runnable,"name1");
    Thread thread2 = new Thread(runnable,"name2");
    thread1.start();
    thread2.start();


  }
}
