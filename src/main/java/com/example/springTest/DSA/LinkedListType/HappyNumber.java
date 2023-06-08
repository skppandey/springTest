package com.example.springTest.DSA.LinkedListType;

public class HappyNumber {

  static boolean isHappyNumber(int n){
    int slow = n;
    int fast = n;
    do {
      slow = squareSum(slow);
      fast = squareSum(squareSum(fast));
    }while(slow != fast);

    return slow==1;
  }
  static int squareSum(int n){
    int sum = 0;
    int digit;
    while(n>0){
      digit=n%10;
      sum +=digit*digit;
      n = n/10;
    }
    return sum;
  }

  public static void main(String[] args) {
    System.out.println(isHappyNumber(24));
  }
}
