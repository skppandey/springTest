package com.example.springTest.DSA;

import java.util.Vector;

public class febonacci {
  static int n1=0,n2=1,n3=0;
  static void printFebonaci(int n){
    if(n>0){
      n3 = n1 + n2;
      n1 = n2;
      n2 = n3;
      System.out.println(n3);
      printFebonaci(n - 1);
    }
  }

  static int printnthFebonaci(int n){
    int n1=0,n2=1,n3=0;
    int x = 0;
    while(x < n){
      n3 = n1 + n2;
      n1 = n2;
      n2 = n3;
//      System.out.println(n3);
      x++;
    }
    return n3;
  }
  public static void main(String args[]){
    febonacci.printFebonaci(8);
    System.out.println(febonacci.printnthFebonaci(8));
  }
}
