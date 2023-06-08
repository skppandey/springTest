package com.example.springTest.collectionsTwo;

public class OurMap<K,V> {
  private Entry<K,V>[] Buckets;
  private static final int defaultSize = 5;
  private static int size;

  public OurMap(){
    this.Buckets = new Entry[defaultSize];
  }
  public OurMap(int newSize){
    this.Buckets = new Entry[newSize];
  }
  public void put(K key, V value){
    Entry<K,V> entry = new Entry<>(key,value,null);
    int bucketIndex = key.hashCode() % Buckets.length;
    Entry<K,V> existing = Buckets[bucketIndex];
    if(existing == null){
      Buckets[bucketIndex] = entry;
      size++;
    }else {
      while (existing.next != null) {
        if (existing.key.equals(key)) {
          existing.value = entry.value;
          size++;
          return;
        }
        existing = existing.next;
      }
      if(existing.key.equals(key)) {
        existing.value = value;
        size++;
      }else{
        existing.next = entry;
      }
    }
  }
  public V get(K key){
    int bucketIndex = key.hashCode() % this.Buckets.length;
    Entry<K,V> bucket = Buckets[bucketIndex];
    while (bucket != null){
      if(bucket.key.equals(key)){
        return bucket.value;
      }
      bucket = bucket.next;
    }
    return null;
  }
}

class Entry<K,V>{
  final K key;
  V value;
  Entry next;
  public Entry(K key,V value,Entry<K,V> next){
    this.key = key;
    this.value = value;
    this.next = next;
  }

  public static void main(String[] args) {
    OurMap<Integer,String> map = new OurMap<>();
    map.put(1,"abcd");
    map.put(2,"rtydf");
    map.put(3,"sddfs");
    map.put(4,"rtdcydf");
    System.out.println(map.get(3));
    map.put(3,"sddfcdfsddfs");
    System.out.println(map.get(3));
  }
}
