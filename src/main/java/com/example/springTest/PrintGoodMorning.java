package com.example.springTest;

public class PrintGoodMorning {
  private static int count = 0;
  private static void print(){
    System.out.println("Good Morning " + count);
    count++;
    if(count < 20){
      print();
    }
  }

  public static void main(String[] args) {
    PrintGoodMorning.print();
  }
}
