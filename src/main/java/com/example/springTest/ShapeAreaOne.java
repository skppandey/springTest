package com.example.springTest;

import com.example.springTest.interfaces.Area;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Qualifier("ShapeAreaOne")
@Service
public class ShapeAreaOne implements Area{
  @Override
  public double Circle(Integer radius) {
    return 3.14*radius*radius;
  }

  @Override
  public Integer Square(Integer side) {
    return side*side;
  }

  @Override
  public Integer Rectangle(Integer l, Integer b) {
    return l*b;
  }
}
