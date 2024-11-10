package step4;

public class TriangleTest {
  public static void main(String[] args) throws MyException {
    method();
  }
  public static void method() throws MyException {
    throw new MyException();
  }
}
class MyException extends Exception {
  private static final long serialVersionUID = 1L;
}