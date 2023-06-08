package com.example.springTest;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SingletonWithSerialize implements Serializable {
  private static volatile SingletonWithSerialize instance = null;

  private SingletonWithSerialize() {
  }

  public static SingletonWithSerialize getInstance() {
    if (instance == null) {
      synchronized (SingletonWithSerialize.class) {
        if (instance == null) {
          instance = new SingletonWithSerialize();
        }
      }
    }
    return instance;
  }
  protected Object readResolve() {
    return instance;
  }

  public static void main(String[] args) throws Exception {

    SingletonWithSerialize instanceOne = SingletonWithSerialize.getInstance();
    ObjectOutput out = new ObjectOutputStream(new FileOutputStream("file.text"));
    out.writeObject(instanceOne);
    out.close();

    ObjectInput in = new ObjectInputStream(new FileInputStream("file.text"));
    SingletonWithSerialize instanceTwo = (SingletonWithSerialize) in.readObject();
    in.close();

    System.out.println("hashCode of instance 1 is - " + instanceOne.hashCode());
    System.out.println("hashCode of instance 2 is - " + instanceTwo.hashCode());
  }
}
