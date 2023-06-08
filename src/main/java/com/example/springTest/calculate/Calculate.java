package com.example.springTest.calculate;

public class Calculate {

  public void calcQuadraticEq(double a, double b, double c) {
    double D = b * b - 4 * a * c;


    if (D > 0) {
      getOutputForDeterminantGreaterThanZero(a, b, D);
    }
    else if (D == 0) {
      getOutputForDeterminantEqualToZero(a, b);
    }
    else {
      System.out.println("Equation has no roots");
    }
  }

  private void getOutputForDeterminantEqualToZero(double a, double b) {
    double x;
    x = -b / (2 * a);
    System.out.println("x = " + x);
  }

  private void getOutputForDeterminantGreaterThanZero(double a, double b, double d) {
    double x1, x2;
    x1 = (-b - Math.sqrt(d)) / (2 * a);
    x2 = (-b + Math.sqrt(d)) / (2 * a);
    System.out.println("x1 = " + x1 + ", x2 = " + x2);
  }


}
