package com.example.springTest.DSA.binarySearch;

public class BinarySearch {
  public static void main(String[] args) {
    int[] arr = new int[]{0,1,6,9,7,5,2,1};
    System.out.println(binarySearch(arr,6));
  }

  private static int binarySearch(int[] arr, int t) {
    int start = 0;
    int end = arr.length - 1;
    while(start <= end){
      int mid = start + (end-start)/2;
      if(arr[mid] < t){
        start = mid+1;
      }else if(arr[mid] > t){
        end = mid-1;
      }else{
        return mid;
      }
    }
    return -1;
  }
}
