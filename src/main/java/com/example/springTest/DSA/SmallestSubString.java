package com.example.springTest.DSA;

import java.util.HashMap;
import java.util.Map;

public class SmallestSubString {
  public static void main (String[] args) throws java.lang.Exception
  {
    String str ="aabdec";
    String Pattern="ab";

    // char[] charArr = Pattern.toCharArray();
    int len = str.length();
    int end = 0;
    int start = 0;
    int tempStart = 0;
    Map<Character, Integer> map = new HashMap<>();
    for(int i=0;i<str.length();i++){

      if(map.size() == Pattern.length()){
        end=i;
        start=tempStart;
      }
      if(Pattern.contains(String.valueOf(str.charAt(i)))){
        if(map.size() < Pattern.length()){
          map.put(str.charAt(i),map.getOrDefault(str.charAt(i),0)+1);
        }else {
          map.put(str.charAt(tempStart),map.get(str.charAt(tempStart))-1);
          if(map.get(str.charAt(tempStart)) == 0){
            map.remove(str.charAt(tempStart));
          }
          tempStart++;
        }
      }

    }

    System.out.print(str.substring(start,end));
  }
}
