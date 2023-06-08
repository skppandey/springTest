package com.example.springTest;

public class HelloWorld {
  static int counter = 1;
  private void print(){
    System.out.println("Hello World :" + counter);
    counter++;
    if(counter <= 100){
      print();
    }
  }
  public static void main(String args[]){
    new HelloWorld().print();
  }
}
