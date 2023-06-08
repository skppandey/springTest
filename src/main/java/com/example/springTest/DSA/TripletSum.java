package com.example.springTest.DSA;

import java.util.Arrays;

public class TripletSum {
  public static void main (String[] args) throws java.lang.Exception
  {
    int[] arr = {-3, 0, 1, 2, -1, 1, -2};
    Arrays.sort(arr); // -3 -2 -1 0 1 1 2
    int target = -1;
    for(int i=0;i<arr.length-1;i++){
      int l = i+1;
      int r = arr.length-1;
      while(l<r){
        if(arr[l] + arr[r] == target - arr[i]){
          System.out.println(arr[l] + " " + arr[r] + " " + arr[i]);
          r--;
          l++;
        }else if(arr[l] + arr[r] > target - arr[i]){
          r--;
        }else{
          l++;
        }
      }
    }
  }
}
