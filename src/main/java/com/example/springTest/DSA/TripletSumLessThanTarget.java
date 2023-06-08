package com.example.springTest.DSA;

import java.util.Arrays;

public class TripletSumLessThanTarget {
  public static void main (String[] args) throws java.lang.Exception
  {
    int[] arr = {-1, 4, 2, 1, 3};
    Arrays.sort(arr);
    int target = 5;
    int count = 0;
    for(int i=0;i<arr.length-2;i++){
      int r = arr.length-1;
      int l = i+1;
      while(l<r){
        if(arr[l] + arr[r] < target - arr[i]){
//          count = count+r-l;
          System.out.println(arr[i] + " " + arr[l] + " " + arr[r]);
          r--;
        }else{
          l++;
        }
      }

    }
    System.out.println(count);
  }
}
