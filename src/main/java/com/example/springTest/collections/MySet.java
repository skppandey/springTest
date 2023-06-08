package com.example.springTest.collections;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MySet<E> {
  private static final int initialSize = 5;
  private int size;
  private Map<E,Integer> storeSets;

  public MySet(){
    this.storeSets = new HashMap<>();
  }
  public MySet(int sizeOfArray){
    this.storeSets = new HashMap<>(initialSize);
  }

  public boolean add(E e){
    if(storeSets.get(e) == 0){
      return false;
    }
    storeSets.put(e,0);
    return true;
  }
  public boolean contains(E e){
    if(storeSets.get(e) == 0){
      return true;
    }
    return false;
  }
}
