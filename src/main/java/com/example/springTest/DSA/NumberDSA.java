package com.example.springTest.DSA;

import java.util.Arrays;

public class NumberDSA {
  static int findLargest(int[] nums){
    int max = nums[0];
    for(int i=0;i< nums.length;i++){
      if(nums[i] > max){
        max = nums[i];
      }
    }
    return max;
  }

  static int findSecondLargest(int[] nums){
    Arrays.sort(nums);
    return nums[nums.length - 2];
  }

  static int print1or2thLargest(int[] nums, int n){
    int max = 0;
    int second = 0;
    for(int i=0;i< nums.length;i++){
      if(nums[i] > max){
        second = max;
        max = nums[i];
      }else if (nums[i] > second && nums[i] !=max){
        second = nums[i];
      }
    }
    if(n == 1){
      return max;
    }else{
      return second;
    }
  }

  public static void main(String[] args){
    System.out.println(NumberDSA.findLargest(new int[]{4,6,2,9,7}));
    System.out.println(NumberDSA.findSecondLargest(new int[]{4,6,2,9,7}));
    System.out.println(NumberDSA.print1or2thLargest(new int[]{4,6,2,9,7}, 2));
  }
}
