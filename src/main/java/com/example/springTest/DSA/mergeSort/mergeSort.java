package com.example.springTest.DSA.mergeSort;

import java.util.Arrays;

public class mergeSort {

  static int[] sort(int[] arr){
    if (arr.length == 1){
      return arr;
    }
    int mid = arr.length/2;
    int[] leftArr = sort(Arrays.copyOfRange(arr,0,mid));
    int[] rightArr = sort(Arrays.copyOfRange(arr,mid,arr.length));

    return merge(leftArr,rightArr);
  }

  private static int[] merge(int[] leftArr, int[] rightArr) {
    int[] mix = new int[leftArr.length + rightArr.length];
    int i=0;
    int j=0;
    int k=0;

    while (i<leftArr.length && j<rightArr.length){
      if(leftArr[i] < rightArr[j]){
        mix[k] = leftArr[i];
        i++;
      }else{
        mix[k] = rightArr[j];
        j++;
      }
      k++;
    }

    while(i < leftArr.length){
      mix[k] = leftArr[i];
      i++;
      k++;
    }
    while(j < rightArr.length){
      mix[k] = rightArr[j];
      j++;
      k++;
    }
    return mix;
  }

  public static void main(String[] args) {
    System.out.println(Arrays.toString(sort(new int[]{5, 3, 4, 1, 2})));
  }
}
