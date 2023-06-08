package com.example.springTest;

import com.example.springTest.PC.PC;

public class Singleton {
  private static PC obj;
  private Singleton(){
    }
  public static PC getInstance(){
    if(obj == null){
      obj = new PC();
    }
    return obj;
  }
}
