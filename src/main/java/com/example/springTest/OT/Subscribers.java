package com.example.springTest.OT;

import com.example.springTest.Customer;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Subscribers {
  private List<String> customer;

  public Subscribers(List<String> customer) {
    this.customer = customer;
  }

  public static void main(String[] args) throws InterruptedException {

    List<String> names = Arrays.asList("name1","name2","name2","name4","name5","name6");
    Subscribers subscribers = new Subscribers(names);
    ExecutorService executorService = Executors.newFixedThreadPool(5);

    for(String name : subscribers.customer){
      IndianExpress r1 = new IndianExpress(name);
      Thread t1 = new Thread(r1);
      executorService.execute(t1);
      t1.join();
    }


//    IndianExpress r1 = new IndianExpress("name1");
//    Thread t1 = new Thread(r1);
//
//    IndianExpress r2 = new IndianExpress("name2");
//    Thread t2 = new Thread(r2);




  }
}
