package com.example.springTest.functionalinterfaceLearn;

public class Square {

  public static void main(String args[]){
    ISquare sqr = (int x) -> x*x;

    int ans = sqr.calculate(5);
    System.out.println(ans);

  }

}
