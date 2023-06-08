package com.example.springTest.DSA;

import java.util.Arrays;

public class ClosestTripletSum {
  public static void main (String[] args) throws java.lang.Exception {
    int[] arr = {-3, -1, 1, 2};
    Arrays.sort(arr); // -3 -2 -1 0 1 1 2
    int target = 1;
    int min = Integer.MAX_VALUE;
    int dif = 0;
    int sum = 0;
    int[] out = new int[3];
    for (int i = 0; i < arr.length - 1; i++) {
      int l = i + 1;
      int r = arr.length - 1;
      while (l < r) {
        dif = target - arr[i];
        sum = arr[l] + arr[r];
        if (Math.abs(sum - dif) < min) {
          out[0] = arr[l];
          out[1] = arr[r];
          out[2] = arr[i];
          min = Math.min(min, Math.abs(sum - dif));
        }
        if (sum == dif) {
          System.out.println(arr[l] + " " + arr[r] + " " + arr[i]);
          break;
        } else if (arr[l] + arr[r] > target - arr[i]) {
          r--;
        } else {
          l++;
        }

      }
    }
    System.out.print(Arrays.toString(out));
  }
}
