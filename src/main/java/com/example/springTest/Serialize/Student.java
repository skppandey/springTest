package com.example.springTest.Serialize;

import java.io.Serializable;

public class Student implements Serializable {
  public String name;
  public int id;
  public Student(String name, int id){
    this.name = name;
    this.id = id;
  }
}
