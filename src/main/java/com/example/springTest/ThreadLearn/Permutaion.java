package com.example.springTest.ThreadLearn;

import java.util.Arrays;

public class Permutaion {
  static boolean isPermutation(String str1,String str2){
    char[] arr1 = str1.toCharArray();
    char[] arr2 = str2.toCharArray();
    Arrays.sort(arr1);
    Arrays.sort(arr1);
    boolean result = Arrays.equals(arr1,arr2);
    return result;
  }

  public static void main (String[] args) throws java.lang.Exception
  {
    String str="oidbcafcba";
    String Pattern="abc";
    int start=0;
    int c = 0;
    int pLen = Pattern.length();
    for(int i=0;i<str.length()-pLen+1;i++){
      if(isPermutation(str.substring(i,i+pLen),Pattern)){
        c++;
      }
    }
    System.out.print(c);
  }
}
