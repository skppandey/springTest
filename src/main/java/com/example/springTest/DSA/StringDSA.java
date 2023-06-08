package com.example.springTest.DSA;

import java.util.HashMap;
import java.util.Map;

public class StringDSA {
  static Character firstDuplicate(String str){
    char[] charSet = new char[256];
    for(int i=0;i<str.length();i++){
      charSet[str.charAt(i)]++;
    }

    for(int i=0;i<str.length();i++){
      if(charSet[str.charAt(i)] > 1){
        return str.charAt(i);
      }
    }
    return null;
  }

  static Character firstNotDuplicate(String str){
    char[] charSet = new char[256];
    for(int i=0;i<str.length();i++){
      charSet[str.charAt(i)]++;
    }

    for(int i=0;i<str.length();i++){
      if(charSet[str.charAt(i)] == 1){
        return str.charAt(i);
      }
    }
    return null;
  }

  static void subsStringPermutation(){
    String str="oidbcaf";
    String Pattern="abc";
    int matched = 0;
    int start = 0;
    boolean flag = false;
    Map<Character,Integer> charMap = new HashMap<>();
    for(char chr : Pattern.toCharArray()){
      charMap.put(chr, charMap.getOrDefault(chr,0) + 1);
    }

    for(int end=0;end<str.length();end++){
      char endChar = str.charAt(end);
      if(charMap.containsKey(endChar)){
        charMap.put(endChar, charMap.get(endChar) - 1);
        if(charMap.get(endChar) == 0){
          matched++;
        }
      }
      if(matched == charMap.size()){
        flag = true;
        break;
      }

      if(end >= Pattern.length()-1){
        char startChar = str.charAt(start++);
        if(charMap.containsKey(startChar)){
          if(charMap.get(startChar) == 0){
            matched--;
          }
          charMap.put(startChar, charMap.get(startChar) + 1);
        }
      }

    }
    System.out.print(flag);
  }

  static int longestSubstringWithoutRepeat(String s){
    boolean[] charSet = new boolean[256];
    int maxlen = 0;
    int temp = 0;
    for(int end=0;end<s.length();end++){
      if(!charSet[s.charAt(end)]){
        charSet[s.charAt(end)] = true;
        temp++;
      }else{
        maxlen = Math.max(maxlen,temp);
        charSet = new boolean[256];
        temp = 0;
      }
      if(temp == s.length()){
        return temp;
      }
    }
    return maxlen;
  }

  public static void main(String[] args){
    System.out.println(StringDSA.firstDuplicate("hubsamsh"));
    System.out.println(StringDSA.firstNotDuplicate("hubsamsh"));
    StringDSA.subsStringPermutation();
    System.out.println(StringDSA.longestSubstringWithoutRepeat("wa"));
  }
}
