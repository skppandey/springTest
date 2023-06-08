package com.example.springTest.compare;

import java.util.Comparator;

public class SchoolComparatorStudents implements Comparator<School> {
  @Override
  public int compare(School o1, School o2) {
    return (o1.getNumberOfStudents() - o2.getNumberOfStudents());
  }
}
