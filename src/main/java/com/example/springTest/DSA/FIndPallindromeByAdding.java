package com.example.springTest.DSA;

public class FIndPallindromeByAdding {

  static boolean checkPallindrome(char[] arr){
    int len = arr.length;
    for(int j=0;j< arr.length;j++){
      if(arr[j] !=arr[len-j-1]){
        return false;
      }
    }
    return true;
  }
  public static void main(String[] args) {
    String str = "?abc?aa";
    char[] arr = str.toCharArray();
    int len = arr.length;
    for (int i=0;i<len;i++){
      if(arr[i] == '?'){
        arr[i] = arr[len-i-1];
      }else if(arr[i]=='?' && arr[len-i-1]=='?'){
        arr[i] = arr[len-i-1] ='a';
      }
    }
    System.out.println(checkPallindrome(arr));
  }
}
