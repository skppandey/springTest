package com.example.springTest.DSA;

public class SumInArray {
  public static void main (String[] args) throws java.lang.Exception
  {
    int[] arr = {1,2,3,4,5,6};
    int target = 6;
    int end = arr.length-1;
    int start = 0;
    int[] out = new int[2];
    for(int i=0;i<arr.length;i++){
      if(arr[start]+arr[end] == target){
        out[0] = start;
        out[1] = end;
        break;
      }if(arr[start]+arr[end] > target){
        end--;
      }else{
        start++;
      }
    }
    System.out.print(out[0] + " " + out[1]);
  }
}
