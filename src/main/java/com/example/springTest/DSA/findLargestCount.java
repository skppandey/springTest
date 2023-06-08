package com.example.springTest.DSA;

import java.util.HashMap;
import java.util.Map;

public class findLargestCount {
  public static void main(String[] args) {
    int[] arr = {1,2,2,3,3,3,3,4,5,6,6,6,6,6,6};
    int count = 1;
    Map<Integer, Integer> map = new HashMap<>();
    for(int i=0;i<arr.length;i++){
        if ( i< arr.length-1 && arr[i] != arr[i + 1]) {
          map.put(arr[i], count);
          count = 0;
        }
        if(i==arr.length-1){
          map.put(arr[i], count);
        }

      count++;
    }

    for(Map.Entry entry : map.entrySet()){
      System.out.println(entry);
    }

  }
}
