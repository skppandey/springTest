package com.example.springTest.TestEmployee;

public class Employee {
  private int id = 0;
  private String name = null;
  private boolean male = true;

  public Employee(int id, String name, boolean male) {
    this.id = id;
    this.name = name;
    this.male = male;
  }

  @Override
  public String toString(){
    return "Employee[id = "+ id + ", name = "+ name +",male = "+ male +"]";
  }

  @Override
  public boolean equals(Object obj){
    if(this == obj){
      return true;
    }
    if(obj == null || obj.getClass()!= this.getClass())
      return false;
    Employee emp = (Employee) obj;
    return (emp.name.equals(this.name));
  }

  @Override
  public int hashCode()
  {
//    return this.id;
    return this.name.hashCode();
  }

}
