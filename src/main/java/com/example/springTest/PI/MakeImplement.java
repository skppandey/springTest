package com.example.springTest.PI;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class MakeImplement {

 static List<Make> getByMakeId(Set<Make> makeSet, int makeId){
    return makeSet.stream().filter(make ->  (make.getMakeId() == makeId)).collect(Collectors.toList());
  }

  public static void main(String[] args) {
    List<Make> makeListOne = new ArrayList<>();
    makeListOne.add(new Make(1,"Product one", 1));
    makeListOne.add(new Make(2,"Product two", 1));
    makeListOne.add(new Make(3,"Product one", 3));

    List<Make> makeListTwo = new ArrayList<>();
    makeListTwo.add(new Make(101,"Product one", 1));
    makeListTwo.add(new Make(102,"Product two", 2));
    makeListTwo.add(new Make(103,"Product one", 3));
    makeListTwo.add(new Make(1,"Product one", 1));

    Set<Make> makeSet = new HashSet<>();
    makeListOne.stream().forEach(make -> makeSet.add(make));
    makeListTwo.stream().forEach(make -> makeSet.add(make));

    for(Make make : makeSet){
      System.out.println(make.toString());
    }

    System.out.println(getByMakeId(makeSet,1));
  }
}
