package com.example.springTest.BST;

public class maxSumSubsequence {
  public static int findMaxSumSubsequence(int[] nums, int i, int prev)
  {
    if (i == nums.length) {
      return 0;
    }
    int excl = findMaxSumSubsequence(nums, i + 1, prev);
    int incl = 0;
    if (prev + 1 != i) {
      incl = findMaxSumSubsequence(nums, i + 1, i) + nums[i];
    }
    return Integer.max(incl, excl);
  }

  public static void main(String[] args)
  {
    int[] nums = { 1, 2, 9, 4, 5, 0, 4, 11, 6 };
    System.out.print("The maximum sum is "
            + findMaxSumSubsequence(nums, 0, Integer.MIN_VALUE));
  }
}
