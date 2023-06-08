package com.example.springTest.OT;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class CompareString {
  private static String[] OrderTheStrings(String[] strArr) {
    Arrays.sort(strArr,(str1,str2) -> {
      if(str1.length() > str2.length()){
        return -1;
      }else if(str1.length() < str2.length()){
        return 1;
      }else{
        return str1.compareTo(str2);
      }
    });
    return strArr;
  }

  public static void main(String[] args) {
    String[] strArr = {"cdef", "d", "cd", "efg", "ijk", "xyz", "b", "pg", "abcd"};
// output      abcd,cdef,efg,ijk,xyz,cd,pg,b,d
    System.out.println(Arrays.toString(OrderTheStrings(strArr)));
  }

}
