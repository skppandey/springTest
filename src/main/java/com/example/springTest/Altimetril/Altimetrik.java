package com.example.springTest.Altimetril;


import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Altimetrik {
  public static void main(String[] args) {
    Integer[] arr = {2, 17, 35, 68, 50};
    List<Integer> arrList = Arrays.asList(arr);
    Collections.sort(arrList, Collections.reverseOrder());
    System.out.println(arrList.get(1));

    List<String> arrString = Arrays.asList("Apple", "Orange", "Orange", "Banana", "Apple", "Orange");

    Map<String,Integer> map = new HashMap<>();
    arrString.stream().forEach(fruit -> {
      map.put(fruit,map.getOrDefault(fruit,0)+1);
    });
    map.entrySet().stream().sorted((e1, e2) -> e2.getValue()-e1.getValue())
            .forEach(stringIntegerEntry -> {
      System.out.println(stringIntegerEntry);
    });
  }
}
