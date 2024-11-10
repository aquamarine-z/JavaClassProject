package step3;


public class Symbol {
    private int color; // 颜色代码

    public String symbol() {
        return "*"; // 默认的符号实现
    }

    public String line(int length) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < length; i++) {
            result.append(symbol());
        }
        return result.toString();
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }
}
