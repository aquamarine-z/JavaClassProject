import javax.script.ScriptEngine;

public class SimpleCalculator {
  // 计算方法，根据操作符进行相应的计算
  public static double calculate(double num1, double num2, String operator) throws IllegalArgumentException{
      switch (operator){
          case "+":
              return num1 + num2;
          case "-":
              return num1 - num2;
          case "*":
              return num1 * num2;
          case "/":
              return num1 / num2;
          default:
              throw new IllegalArgumentException("未知运算符!");
      }
  }

  // 主方法
  public static void main(String[] args) {
    if(args.length != 3) {
      System.out.println("输入错误");
    }else {
      double v1 = Double.parseDouble(args[0]);
      double v2 = Double.parseDouble(args[2]);
      String operator = args[1];
      System.out.println(calculate(v1, v2, operator));
    }
  }
}