package step1;

public class Circle {
    public Circle() {
        this.radius = 1.0;
        count++;
    }
    public Circle(double radius){
        this.radius = radius;
        count++;
    }
    public double area(){
        return Math.PI*radius*radius;
    }
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    double radius;

    public static int getCount() {
        return count;
    }

    static int count;
}