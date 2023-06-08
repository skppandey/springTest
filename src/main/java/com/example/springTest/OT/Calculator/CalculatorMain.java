package com.example.springTest.OT.Calculator;

public class CalculatorMain {
  public static void main(String[] args) {
    CalculateOperation calculateOperation = new Subtract(2,3);
    Calculator calculator = new Calculator();
    calculator.calculate(calculateOperation);
  }
}
