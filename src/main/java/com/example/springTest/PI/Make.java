package com.example.springTest.PI;

public class Make {
  private int id;
  private String name;
  private int makeId;

  public Make(int id, String name, int makeId) {
    this.id = id;
    this.name = name;
    this.makeId = makeId;
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

  public int getMakeId() {
    return makeId;
  }

  public void setMakeId(int makeId) {
    this.makeId = makeId;
  }

  @Override
  public int hashCode() {
    return this.id;
  }

  @Override
  public boolean equals(Object obj) {
    if(obj == null ){
      return false;
    }
    Make make = (Make) obj;
    return (this.id == make.getId() && this.name == make.getName() && this.makeId == make.getMakeId());
  }

  @Override
  public String toString() {
    return "Make{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", makeId=" + makeId +
            '}';
  }
}
