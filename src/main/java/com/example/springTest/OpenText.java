package com.example.springTest;

import java.util.ArrayList;
import java.util.List;

public class OpenText {

  public static void main(String args[]){
    int[] arr = {5,7,19,2,3,1};
    List<Integer> leaders = new ArrayList<>();
    for(int i=0;i<arr.length;i++){
      int count =0;
      for(int j=i+1;j<arr.length;j++){
        if(arr[i] < arr[j]){
          break;
        }else{
          count++;
        }
      }
      if(count == arr.length -1 - i){
        leaders.add(arr[i]);
      }
    }
    System.out.println(leaders);
    leaders.forEach(x -> System.out.println(x));

  }
}
