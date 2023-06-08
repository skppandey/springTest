package com.example.springTest.DSA.bubbleSort;

import java.util.Arrays;

public class Bubble {

  static int[] sort(int[] arr){
    for(int i=0;i<arr.length;i++){
      for(int j=1;j<arr.length;j++){
        if(arr[j] < arr[j-1]) {
          int temp = arr[j];
          arr[j] = arr[j-1];
          arr[j-1] = temp;
        }
      }
    }return arr;
  }

  public static void main(String[] args) {
    System.out.println(Arrays.toString(sort(new int[]{5, 4, 2, 3, 1})));
  }
}
