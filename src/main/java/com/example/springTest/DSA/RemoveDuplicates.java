package com.example.springTest.DSA;


import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicates {
  public static void main(String[] args) {
    int[] arr = {2, 3, 3, 3, 6, 9, 9};
    List<Integer> entries = Arrays.asList(2, 3, 3, 3, 6, 9, 9) ;
    Set<Integer> unique = new HashSet<>();
    List<Integer> list = entries.stream().filter(num -> !unique.add(num)).collect(Collectors.toList());
    System.out.println(unique);
    System.out.println(list);

    List<Integer> entries2 = Arrays.asList(-2, -1, 0, 2, 3) ;

    List<Integer> sqr = entries2.stream().map(num -> num*num).collect(Collectors.toList());
    Collections.sort(sqr);
    System.out.println(sqr);
  }
}
