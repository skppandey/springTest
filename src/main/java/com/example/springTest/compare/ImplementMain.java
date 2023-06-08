package com.example.springTest.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ImplementMain {
  public static void main(String args[]){
    //Comparable Example
    List<School> schoolList = new ArrayList<>();
    schoolList.add(new School(2,"Saint Francis",54));
    schoolList.add(new School(1,"GorakhNath",56));
    schoolList.add(new School(3,"Atulanand",40));
    schoolList.add(new School(4,"Peter England",23));
    for(School s : schoolList){
      System.out.println(s.toString());
    }
    System.out.println();
//    Collections.sort(schoolList,Collections.reverseOrder());
    Collections.sort(schoolList);
    for(School s : schoolList){
      System.out.println(s.toString());
    }
    //---------------------------------

    System.out.println();System.out.println();System.out.println();

    //Comparator Example for class SchoolNew
    List<SchoolNew> schoolNewList = new ArrayList<>();
    schoolNewList.add(new SchoolNew(2,"Saint Francis",54));
    schoolNewList.add(new SchoolNew(1,"GorakhNath",56));
    schoolNewList.add(new SchoolNew(3,"Atulanand",40));
    schoolNewList.add(new SchoolNew(4,"Peter England",23));
    for(SchoolNew s : schoolNewList){
      System.out.println(s.toString());
    }
    System.out.println();
    Collections.sort(schoolNewList, new SchoolComparatorName());
    for(SchoolNew s : schoolNewList){
      System.out.println(s.toString());
    }
    Collections.sort(schoolNewList, new Comparator<SchoolNew>() {
      @Override
      public int compare(SchoolNew o1, SchoolNew o2) {
        return o2.getId() - o1.getId();
      }
    });
    for(SchoolNew s : schoolNewList){
      System.out.println(s.toString());
    }
  }
}
