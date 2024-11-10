package step2;

public class Triangle {
  private double a, b, c; // 三边
  public Triangle() {
    setA(1.0);
    setB(1.0);
    setC(1.0);
  }
  public Triangle(double a, double b, double c) {
    setA(a);
    setB(b);
    setC(c);
  }
  public double perimeter() {
    return a + b + c;
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
  public double getC() {
    return c;
  }
  public void setC(double c) {
    this.c = c;
  }
  public static boolean checkSides(double a, double b, double c){
    // 待完成
      return (a+b>c)&&(a+c>b)&&(b+c>a);
  }
}
