package com.example.springTest;

import com.example.springTest.interfaces.Area;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
  @Autowired
  private CustomerService customerService;
  @Autowired
  private ClientService clientService;

  @Qualifier("ShapeAreaOne")
  @Autowired
  private Area area;

  @GetMapping("/list")
  public List<Customer> getList(){
    return customerService.getList();
  }
  @GetMapping("/client")
  public Client getClient(){
    return customerService.geClientData();
  }
  @GetMapping("/area")
  public double getArea(){
    return area.Square(2);
  }
  @GetMapping("/task")
  public void getTask(){
    customerService.getTask();
  }
}
