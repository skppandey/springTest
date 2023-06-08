package com.example.springTest.practice;

import com.example.springTest.PI.Make;

import java.util.HashMap;
import java.util.Map;

public class OurMap<K,V> {
  private Entry<K,V>[] buckets;
  static private int initial_capacity = 5;
  private int size = 0;

  public OurMap(){
    buckets = new Entry[initial_capacity];
  }
  public OurMap(int capacity){
    buckets = new Entry[capacity];
  }

  public void put(K key, V value){
    Entry<K,V> entry = new Entry<>(key, value, null);
    int index = Math.abs(key.hashCode() % buckets.length);
    Entry<K,V> existingBucket = buckets[index];
    if(existingBucket == null){
      buckets[index] = entry;
      size++;
    }else{
      while (existingBucket.next != null){
        if(existingBucket.key.equals(entry.key)){
          existingBucket.value = entry.value;
        }
        existingBucket = existingBucket.next;
      }
      if(existingBucket.key.equals(entry.key)){
        existingBucket.value = entry.value;
      }else{
        existingBucket.next = entry;
        size++;
      }
    }
  }

  public V get(K key){
    V value = null;
    int index = Math.abs(key.hashCode() % buckets.length);
    Entry<K,V> existingEntry = buckets[index];
    if(existingEntry == null){
      throw new RuntimeException("Key Not Found");
    }else{
      while(existingEntry.next != null){
        if(existingEntry.key.equals(key)){
          value = existingEntry.value;
        }
        existingEntry = existingEntry.next;
      }
      if(existingEntry.key.equals(key)){
        value = existingEntry.value;
      }else{
        throw new RuntimeException("Key Not Found");
      }
    }
    return value;
  }

  public boolean remove(K key){
    int index = Math.abs(key.hashCode() % buckets.length);
    Entry<K,V> existingEntry = buckets[index];
    Entry<K,V> newEntry = null;
    if(existingEntry == null){
      throw new RuntimeException("Invalid Key");
    }else{
      while(existingEntry.next != null){
        if(existingEntry.key.equals(key)){
          newEntry = existingEntry.next;
          buckets[index] = newEntry;
          return true;
        }
        newEntry = existingEntry;
        existingEntry = existingEntry.next;
      }
    }
    return false;
  }


}
