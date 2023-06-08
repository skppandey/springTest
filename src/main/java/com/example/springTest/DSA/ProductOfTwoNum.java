package com.example.springTest.DSA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProductOfTwoNum {
  public static void main (String[] args) throws java.lang.Exception
  {
    int[] arr = {2, 5, 3, 10};
    int target = 30;
    List<List<Integer>> out = new ArrayList<>();
    for(int i=0;i<arr.length;i++){
      List<Integer> list = new ArrayList<>();
      if(arr[i]<target){
        list.add(arr[i]);
        out.add(list);
      }
      if( i+1 < arr.length && arr[i] * arr[i+1] < target ){
        list = new ArrayList<>();
        list.add(arr[i]);
        list.add(arr[i+1]);
        out.add(list);
      }

    }
    System.out.println(out);
  }
}
