package com.example.springTest.PI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arrange {

  static void printMaxContiguousSubArraySum(Integer[] arr,int k){    //3,1,1,2,2,2,5,1,6
    int sum = 0;
    int max = 0;                     // 6
    int start = 0;
    List<List<Integer>> out = new ArrayList<>();
    for(int end=0;end<arr.length;end++){
      sum +=arr[end];
      while(sum >= k){
        if(sum == k) {
          max = Math.max(max,end-start+1);
          List<Integer> subArray = Arrays.asList(Arrays.copyOfRange(arr, start, end + 1));
          out.add(subArray);
        }
        sum -=arr[start];
        start++;
      }
    }
    System.out.println(out.toString());

  }

  public static void main(String[] args) {
    int[] arr = {3,1,1,2,2,2,5,1,6};
    int k = 6;
//    sumEqualsK(arr, k);

    printMaxContiguousSubArraySum(new Integer[]{3,1,1,2,2,2,5,1,6},6);

//    list.stream().forEach(entry -> System.out.println(String.valueOf(entry)));
  }

  private static void sumEqualsK(int[] arr, int k) {
    Arrays.sort(arr);
    int left = 0;
    int right = arr.length-1;
    while(left < right){
      if(arr[left] + arr[right] == k){
        List<Integer> out = new ArrayList<>();
        out.add(arr[left]);
        out.add(arr[right]);
        System.out.println(out);
        left++;
        right--;
        continue;
      }
      if(arr[left] == k){
        List<Integer> out = new ArrayList<>();
        out.add(arr[left]);
        System.out.println(out);
      }
      if(arr[right] == k){
        List<Integer> out = new ArrayList<>();
        out.add(arr[right]);
        System.out.println(out);
      }
      if(arr[left] + arr[right] > k){
        right--;
      }else{
        left++;
      }
    }
  }
}
