package com.example.springTest.practice;

public class Entry <K,V>{
  final K key;
  V value;
  Entry<K,V> next;

  public Entry(K key, V value, Entry<K, V> next) {
    this.key = key;
    this.value = value;
    this.next = next;
  }
}
