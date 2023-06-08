package com.example.springTest.enums;

public enum Size {
  small("S"),
  medium("M"),
  large("L"),
  extra_large("XL");

  private final String color;
  Size(String value){
    this.color = value;
  }
  public String getColor(){
    return color;
  }
  }

