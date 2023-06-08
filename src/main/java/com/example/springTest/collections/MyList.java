package com.example.springTest.collections;


import java.util.Arrays;

public class MyList<E>{
  private static final int DEFAULT_INITIAL_CAPACITY = 5;
  private int size = 0;
  private transient Object[] customArrayListElementData;


  public MyList(int initialCapacity){
    if (initialCapacity < 0)
      throw new IllegalArgumentException("Illegal Capacity: "+
              initialCapacity);
    this.customArrayListElementData = new Object[initialCapacity];
  }

  public MyList(){
    this.customArrayListElementData = new Object[DEFAULT_INITIAL_CAPACITY];
  }

  public int size() {
    return size;
  }

  public boolean add(E e){
    if(this.customArrayListElementData.length - size <= 0){
      customArrayListElementData = Arrays.copyOf(customArrayListElementData, customArrayListElementData.length*2);
    }
    customArrayListElementData[size++] = e;
    return true;
  }

  public E get(int index){
    if(index < this.size){
      return (E) this.customArrayListElementData[index];
    }
    else{
      throw new ArrayIndexOutOfBoundsException();
    }
  }
  public boolean remove(int index){
    if(index < this.size){
      Object[] newArr = new Object[this.size-1];
      for(int i=0,k=0;i<this.size;i++){
        if(i==index){
          continue;
        }
        newArr[k++] = customArrayListElementData[i];
      }
      customArrayListElementData=newArr;
      size--;
      return true;
    }
    return false;
  }

  public static void main(String[] args) {
    MyList<Integer> list = new MyList<>();
    list.add(5);
    list.add(6);
    list.add(8);
    list.add(7);
    System.out.println(list);

    System.out.println(list.get(2));
    System.out.println(list.remove(2));
  }
}
