package com.example.springTest.DSA;

public class printNumbers {
  static int print(int count){
    if(count <= 100){
      System.out.println("Hello " + count );
      return print(count + 1);
    }
    return 100;
  }

  public static void main (String[] args)
  {
    print(1);
  }
}
