package com.example.springTest.DSA;

import java.util.Arrays;

public class IndexMatch {
  public static void main(String[] args) {
    int[] arr = {2,1,2,2,2,1,1,1};
    System.out.println(Arrays.toString(arr));
    int evenIndex = 0;
    int oddIndex = 1;
    int temp = 0;
    while (true){
      while (evenIndex < arr.length - 1 && arr[evenIndex] % 2 == 0) {
        evenIndex = evenIndex + 2;
      }
      while (oddIndex < arr.length - 1 && arr[oddIndex] % 2 != 0) {
        oddIndex = oddIndex + 2;
      }
      if (evenIndex< arr.length && oddIndex< arr.length) {
        temp = arr[evenIndex];
        arr[evenIndex] = arr[oddIndex];
        arr[oddIndex] = temp;
      }else{
        break;
      }
    }
    System.out.println(Arrays.toString(arr));
  }
}
