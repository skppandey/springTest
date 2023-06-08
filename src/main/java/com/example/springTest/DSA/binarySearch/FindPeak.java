package com.example.springTest.DSA.binarySearch;

public class FindPeak {
  public static void main(String[] args) {
    int[] arr = {0,1,6,9,7,5,2,1};
    System.out.println(findPeakInArray(arr));
  }

  private static int findPeakInArray(int[] arr) {
    int start = 0;
    int end = arr.length-1;
    int peak = 0;
    while(start <= end){
      int mid = start + (end-start)/2;
      if(arr[mid] > arr[mid+1]){
        end = mid;
      } else{
        start = mid+1;
      }
    }
    return arr[start];
  }
}
