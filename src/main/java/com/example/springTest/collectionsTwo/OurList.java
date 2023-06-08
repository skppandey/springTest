package com.example.springTest.collectionsTwo;

import java.util.Arrays;

public class OurList <E> {
  private static final int INITIAL_CAPACITY = 5;
  private static int size;
  private Object[] storeElements;

  public OurList() {
    this.storeElements = new Object[INITIAL_CAPACITY];
  }

  public OurList(int providedSize) {
    this.storeElements = new Object[providedSize];
  }

  public void add(E e) {
    if (this.storeElements.length - this.size <= 0) {
      this.storeElements = Arrays.copyOf(this.storeElements, this.storeElements.length * 2);
    }
    this.storeElements[size++] = e;
  }

  public E get(int index) {
    if (index < size) {
      return (E) this.storeElements[index];
    }
    throw new ArrayIndexOutOfBoundsException();
  }

  public boolean remove(int index) {
    if (index < size) {
      Object[] copyArr = new Object[size - 1];
      for (int i = 0, k = 0; i < size; i++) {
        if (i == k) {
          continue;
        }
        copyArr[k++] = this.storeElements[i];
      }
      this.storeElements = copyArr;
      this.size--;
      return true;
    } else {
      throw new ArrayIndexOutOfBoundsException();
    }
  }

  public int size() {
    return this.size;
  }


  public static void main(String[] args) {
    OurList<Integer> list = new OurList<>();
    list.add(2);
    list.add(5);
    list.add(3);
    list.add(7);
    list.add(4);
    list.add(8);
    System.out.println(list.get(2));
    System.out.println(list.size());
    System.out.println(list.remove(4));
    System.out.println(list.size());

  }
}