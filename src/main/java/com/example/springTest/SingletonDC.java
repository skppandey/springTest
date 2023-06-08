package com.example.springTest;

import java.lang.reflect.Constructor;

public class SingletonDC{
  private static SingletonDC instance;
  private SingletonDC(){
    if(instance != null){
      throw new RuntimeException("Instance is already Present");
    }
  }
  public static SingletonDC getInstance(){
    if(instance == null){
      synchronized (SingletonDC.class){
        if(instance == null){
          instance = new SingletonDC();
        }
      }
    }
    return instance;
  }

  public static void main(String[] args) throws NoSuchMethodException {
    SingletonDC objOne = SingletonDC.getInstance();
    SingletonDC objTwo = null;
    try {
      Constructor constructor = SingletonDC.class.getDeclaredConstructor();
      constructor.setAccessible(true);
      objTwo = (SingletonDC) constructor.newInstance();
    } catch (Exception ex) {
      System.out.println(ex);
    }

    System.out.println("Hashcode of Object 1 - "+objOne.hashCode());
    System.out.println("Hashcode of Object 2 - "+objTwo.hashCode());
  }
}
