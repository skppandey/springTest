package com.example.springTest.OT.Calculator;

import java.security.InvalidParameterException;

public class Calculator {
  double result;
  public void calculate(CalculateOperation calculateOperation){
    if(calculateOperation == null){
      throw new InvalidParameterException("Give valid Operation");
    }
    calculateOperation.perform();
  }
}
