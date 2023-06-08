package com.example.springTest;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class ClientService {

  private List<Employee> getEmployee(){
    List<Employee> employees = new ArrayList<>();
     employees.add(Employee.builder()
            .employeeId(000001)
            .company("SAP")
            .emailId("skp123@sap.com")
            .name("Shubham")
            .build());
     return employees;

  }
  public Client getClient(){
    return Client.builder()
            .id("0000111")
            .name("HP")
            .employee(getEmployee())
            .build();
  }
  public void show(){
    System.out.println(getClient());
  }
}