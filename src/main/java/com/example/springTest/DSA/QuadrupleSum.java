package com.example.springTest.DSA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuadrupleSum {
  public static void main (String[] args) throws java.lang.Exception
  {
    int[] arr = {4, 1, 2, -1, 1, -3};
    Arrays.sort(arr);
    int target = 1;
    List<List<Integer>> out = new ArrayList<>();
    for(int i=0;i<arr.length-1;i++){
      int l= i+1;
      int r = arr.length-1;
      int k = r-1;
      while(l<r){
        List<Integer> list = new ArrayList<>();
        if(arr[i]+arr[l]+arr[r] +arr[k] == target){
          list.add(arr[i]);
          list.add(arr[l]);
          list.add(arr[r]);
          list.add(arr[k]);
          out.add(list);
          k--;
        }else if(arr[i]+arr[l]+arr[r]+arr[r-1] < target){
          l++;
        }else{
          r--;
        }
      }
    }
    System.out.println(out);
  }
}
