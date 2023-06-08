package com.example.springTest.DSA;

public class MinimumWindowSort {
  public static void main (String[] args) throws java.lang.Exception
  {
    int[] arr = {1, 3, 2, 0, -1, 7, 10};
    int l= arr.length-1;
    int r = 0;
    int len = arr.length;
    for(int i=0;i<len-1;i++){
      if(arr[i] > arr[i+1]){
        l=Math.min(l,i);

      }
      if(arr[len-i-2] > arr[len-i-1]){
        r= Math.max(r,len-i-1);
      }
    }
    System.out.print(l + " " + r);
  }
}
