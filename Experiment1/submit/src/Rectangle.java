public class Rectangle {
    private double width;
    private double height;
    private double centerX;
    private double centerY;
    private double angle;
    private static final int VERTEX0 = 0;
    private static final int VERTEX1 = 1;
    private static final int VERTEX2 = 2;
    private static final int VERTEX3 = 3;
    public void move(double dx, double dy){
        centerX += dx;
        centerY += dy;
    }
    public void moveTo(double x, double y){
        centerX = x;
        centerY = y;
    }
    public void rotate(double angle){
        this.angle += angle;
    }

}
