package com.example.springTest.kkdsa;

public class SearchInString {
  public static void main(String args[]){
    String name = "Shubham";
    char target = 'u';
    System.out.printf(String.valueOf(search(name,target)));
  }

  static boolean search(String name, char target) {
    if(name.length()==0){
      return false;
    }
    for (int i=0;i<name.length();i++){
      if(name.charAt(i) == target){
        return true;
      }
    }
    return false;
  }

}
