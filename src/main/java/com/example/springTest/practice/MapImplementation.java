package com.example.springTest.practice;

public class MapImplementation {
  public static void main(String[] args) {
    OurMap<String,Integer> map = new OurMap<>();
    map.put("Shubham", 1);
    map.put("Appy", 2);
    map.put("Shufdsdbham", 3);
    map.put("sdsd", 4);
    System.out.println(map.get("sdsd"));
    map.remove("sdsd");
  }
}
