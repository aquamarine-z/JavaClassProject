package step3;

public class Triangle {
    private double a, b, c; // 三边

    public Triangle() {
        setA(1.0);
        setB(1.0);
        setC(1.0);
    }

    public Triangle(double a, double b, double c) {
        checkSides(a, b, c);
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
        checkSides(a, b, c);
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        checkSides(a, b, c);
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        checkSides(a, b, c);
        this.c = c;
    }

    public void checkSides(double a, double b, double c) {
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new TriangleSideException("存在边长小于零");
        }
        if ((a + b <= c) || (a + c <= b) || (b + c <= a)) {
            throw new TriangleSideException("两边之和小于等于第三边");
        }
        // 待完成
    }

    public static Triangle[] fromArray(double[][] a) {
        Triangle[] tri = new Triangle[a.length];
        for (int i = 0; i < a.length; i++) {
            try {
                tri[i] = new Triangle(a[i][0], a[i][1], a[i][2]);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

            // 使用构造器来创建三角形：a[i][0],a[i][1],a[i][2]表示第i个三角形的三边
            // 使用try-catch来捕获创建三角形可能抛出的异常
            // 异常捕获之后使用System.out.println打印消息：e.getMessage()
        }
        return tri;
    }
}
