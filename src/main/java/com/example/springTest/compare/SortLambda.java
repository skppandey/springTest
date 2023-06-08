package com.example.springTest.compare;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SortLambda {
  public static void main(String[] args) {
    List<SchoolNew> schoolNewList = new ArrayList<>();
    schoolNewList.add(new SchoolNew(2,"Saint Francis",54));
    schoolNewList.add(new SchoolNew(1,"GorakhNath",56));
    schoolNewList.add(new SchoolNew(3,"Atulanand",40));
    schoolNewList.add(new SchoolNew(4,"Peter England",23));

    schoolNewList.stream().sorted((s1,s2) -> s2.getNumberOfStudents() - s1.getNumberOfStudents()).forEach(s -> System.out.println(s));
  }
}
