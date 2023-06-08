package com.example.springTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Service
public class CustomerService {
    private ExecutorService executor;
    private static List<Customer> list = new ArrayList<>();
    @Autowired
    private ClientService clientService;
    static {
      Customer c = new Customer();
      c.setId("000001");
      c.setName("John");
      c.setLocation("Berlin");
      list.add(c);
    }
    public List<Customer> getList(){
      return list;
    }
    public Client geClientData(){
      return clientService.getClient();
    }
    public CustomerService(){
      executor = Executors.newFixedThreadPool(5);
    }
    public void getTask(){

        Runnable r1 = new OddEvenExample();
        this.executor.execute(r1);

    }
  }

