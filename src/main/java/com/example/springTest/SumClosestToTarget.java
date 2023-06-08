package com.example.springTest;

import java.util.Arrays;

import static java.lang.Math.abs;

public class SumClosestToTarget {
//  nums = [-1,2,1,-4], target = 1

  static int sum(int[] nums, int target){
    int sumClosest = Integer.MAX_VALUE;
    int tempSum = 0;
    Arrays.sort(nums);
    for(int i=0;i<nums.length-2;i++){
      int p1 = i+1;
      int p2 = nums.length-1;
      while(p1<p2) {
        tempSum = nums[i] + nums[p1] + nums[p2];

        if(abs(target - tempSum) < abs(target - sumClosest)){
          sumClosest = tempSum;
        }
        if(i == nums.length-3){
          System.out.println(nums[i] + " " + nums[p1] + " " + nums[p2]);
        }
        if(tempSum > target){
          p2--;
        }else{
          p1--;
        }
      }

    }
    return sumClosest;
  }
public static void main(String args[]){
  System.out.println(sum(new int[]{-1,2,1,-4}, 1));
}
}
