package com.example.springTest.OT.Calculator;

public class Subtract implements CalculateOperation{
  private double left;
  private double right;
  private double result = 0.0;

  public Subtract(double left, double right) {
    this.left = left;
    this.right = right;
  }

  public double getLeft() {
    return left;
  }

  public void setLeft(double left) {
    this.left = left;
  }

  public double getRight() {
    return right;
  }

  public void setRight(double right) {
    this.right = right;
  }

  public double getResult() {
    return result;
  }

  public void setResult(double result) {
    this.result = result;
  }

  @Override
  public void perform() {
    result=right-left;
    System.out.println(result);
  }
}
