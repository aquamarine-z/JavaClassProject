package step5;

public class Test {
    /* Question1
    public static void main(String[] args) {
      String s1 = "java";
      String s2 = "java";
      String s3 = new String("java");
      String s4 = new StringBuilder("java").toString();
      System.out.printf("%b,%b,%b", s1 == s2, s3 == s4, s1.equals(s4));
    }
    */
    /* Question2
  public static void main(String[] args) {
    String s1 = "hello";
    System.out.println(s1.substring(1, 3));
  }*/
    public static void main(String[] args) {
        String s1 = "java";
        s1 += "123";
        System.out.println(s1);
    }
}