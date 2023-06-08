package com.example.springTest.compare;

import java.util.Comparator;

public class SchoolComparatorName implements Comparator<SchoolNew>  {

  @Override
  public int compare(SchoolNew o1, SchoolNew o2) {
    return o1.getName().compareTo(o2.getName());
  }
}
