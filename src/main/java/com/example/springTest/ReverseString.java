package com.example.springTest;

public class ReverseString {
  public static void main(String[] args) {
    String str = "abcd";
    StringBuilder sbr = new StringBuilder();
    for(int i=str.length()-1;i>=0;i--){
      sbr.append(str.charAt(i));
    }
    System.out.println(sbr.toString());
  }
}
