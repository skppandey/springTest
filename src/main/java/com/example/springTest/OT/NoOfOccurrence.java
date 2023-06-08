package com.example.springTest.OT;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NoOfOccurrence {

  static int noOfOccurence(Integer[] arr, int k) {
    List<Integer> list = Arrays.asList(arr);
   int count =  list.stream().filter(num -> num.equals(k)).collect(Collectors.toList()).size();
   return count;
  }

  public static void main(String[] args) {
    Integer[] arr = new Integer[]{0,0,0,1,1,1,1,1,2,2};
    int k = 1;
    System.out.println(noOfOccurence(arr,k));
  }
}
