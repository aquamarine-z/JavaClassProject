
package step1;

public class Triangle {
  private double a;
  private double b;

  public double getC() {
    return c;
  }

  public void setC(double c) {
    this.c = c;
  }

  public double getA() {
    return a;
  }

  public void setA(double a) {
    this.a = a;
  }

  public double getB() {
    return b;
  }

  public void setB(double b) {
    this.b = b;
  }

  private double c; // 三边

  public Triangle(double a, double b, double c) {
    this.a = a;
    this.b = b;
    this.c = c;
  }

  public Triangle() {
    this(1, 1, 1);
  }
  public double perimeter() {
    return a + b + c;
  }
}
