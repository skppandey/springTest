package com.example.springTest.DSA.quickSort;

import java.util.Arrays;

public class QuickSort {

  static void sort(int[] arr, int low, int hi){
    if(low>=hi){
      return;
    }
    int s = low;
    int e = hi;
    int mid = s + (e-s)/2;
    int pivot = arr[mid];

    while (s <= e){
      while (arr[s] < pivot){
        s++;
      }
      while (arr[e] > pivot){
        e--;
      }
      if(s <= e){
        int temp = arr[e];
        arr[e] = arr[s];
        arr[s] = temp;
        s++;
        e--;
      }
    }
    sort(arr,low,e);
    sort(arr,s,hi);
  }

  public static void main(String[] args) {
    int[] arr = {5,3,4,2,1};
    sort(arr,0,arr.length-1);
    System.out.println(Arrays.toString(arr));
  }
}
