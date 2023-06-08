package com.example.springTest.DSA;

import java.util.List;

public class SwapCharacter {
  public static void main(String[] args) {
    String[] strArr = {"corn","horn","dpso","eqtp","corn","eqtp","dpso","corn"};

    int count = 0;
    for(int i=0;i<strArr.length;i++){
      for(int j=0;j<strArr.length;j++){
        if(getIncrementString(strArr[i]).equals(strArr[j])){
          count++;
        }
      }
    }
    System.out.println(count);

  }
  static String getIncrementString(String str){
    char[] arr = str.toCharArray();
    for(int i=0;i<arr.length;i++){
      if(arr[i]=='z'){
        arr[i]='a';
      }else{
        arr[i] = ++arr[i];
      }
    }
    return new String(arr);
  }
}
