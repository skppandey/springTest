package com.example.springTest.compare;

public class School implements Comparable<School> {
  private int id;
  private String name;
  private int numberOfStudents;

  public School(int id, String name, int numberOfStudents) {
    this.id = id;
    this.name = name;
    this.numberOfStudents = numberOfStudents;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getNumberOfStudents() {
    return numberOfStudents;
  }

  public void setNumberOfStudents(int numberOfStudents) {
    this.numberOfStudents = numberOfStudents;
  }

  @Override
  public int compareTo(School s) {
    return (this.numberOfStudents - s.numberOfStudents);
  }
  @Override
  public String toString() {
    return "[id=" + this.id + ", name=" + this.name + ", noOfStudents=" + this.numberOfStudents + "]";
  }
}
