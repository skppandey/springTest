package com.example.springTest.DSA;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class finSumInArray {
  public static void main(String[] args) {
    int[] arr = {1,2,5,8,11,14,24,67,101};
    int k = 13;
    int len = arr.length-1;
    Map<Integer,Integer> map = new HashMap<>();
    for(int i=0;i<=len;i++){
      int start = i;
      int end = len;
      while(start<=end){
        int mid = start + (end-start)/2;
        if(arr[i] + k > arr[mid]){
          start = mid+1;
        }else if(arr[i] + k < arr[mid]){
          end = mid-1;
        }else{
          map.put(arr[i],arr[mid]);
          break;
        }
      }
    }
    for(Map.Entry entry: map.entrySet()){
      System.out.println(entry);
    }
  }
}
