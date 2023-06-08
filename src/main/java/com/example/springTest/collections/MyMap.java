package com.example.springTest.collections;

public class MyMap<K,V> {
  private static final int initialSize = 5;
  private Entry[] buckets;
  private int size = 0;
  public MyMap(){
    buckets = new Entry[initialSize];
  }
  public MyMap(int givenSize){
    buckets = new Entry[givenSize];
  }
  public void put(K key,V value){
    Entry<K,V> entry = new Entry<>(key,value,null);
    int bucketIndex = key.hashCode() % this.size;
    Entry<K,V> existing = buckets[bucketIndex];
    if(existing == null) {
      buckets[bucketIndex] = entry;
      size++;
    }else {
      while(existing.next != null){
        if(existing.key.equals(entry.key)){
          existing.value = entry.value;
          return;
        }
        existing=existing.next;
      }
      if(existing.key.equals(key)){
        existing.value = entry.value;
      }else{
        existing.next = entry;
        size++;
      }
    }
  }

  public V get(K key){
    int bucketIndex = key.hashCode() % this.size;
    Entry<K,V> entry = buckets[bucketIndex];
    while (entry.next !=null){
      if(entry.key.equals(key)){
        return entry.value;
      }
      entry=entry.next;
    }
    return null;
  }

}
class Entry<K,V>{
  K key;
  V value;
  Entry<K,V> next;
  public Entry(K key, V value, Entry<K,V> next){
    this.key = key;
    this.value = value;
    this.next = next;
  }
}
