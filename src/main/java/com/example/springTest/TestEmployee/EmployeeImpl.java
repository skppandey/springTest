package com.example.springTest.TestEmployee;

import java.util.HashSet;
import java.util.Set;

public class EmployeeImpl {
  public static void main(String[] args) {
    Set<Employee> empSet = new HashSet<>();
    empSet.add(new Employee(1,"skp",true));
    empSet.add(new Employee(1,"skp",false));
    empSet.add(new Employee(2,"skp",true));
    empSet.add(new Employee(3,"skp",true));
    empSet.add(new Employee(4,"skp",true));
    empSet.add(new Employee(5,"skp",true));
    empSet.add(new Employee(6,"skp1",true));
    empSet.add(new Employee(1,"skp2",true));

    for(Employee emp : empSet){
      System.out.println(emp.toString());
    }

  }
}
