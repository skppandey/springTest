package com.example.springTest.DSA;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Vector;

public class largestNumber {
  static void printlargest(Vector<String> str){
    Collections.sort(str, new Comparator<String>() {
      @Override
      public int compare(String x, String y) {
        String xy = x + y;
        String yx = y + x;
        return xy.compareTo(yx) > 0 ? -1 : 1;
      }
    });
    Iterator it = str.iterator();
    while(it.hasNext()){
      System.out.print(it.next());
    }
  }
  public static void main(String args[]){
    Vector<String> v = new Vector<String>();
    int[] arr = new int[]{45,456,60,50};
    for(int i=0;i<arr.length;i++){
      v.add(String.valueOf(arr[i]));
    }
    largestNumber.printlargest(v);
  }
}
