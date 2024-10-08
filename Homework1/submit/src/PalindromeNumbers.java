public class PalindromeNumbers {
  // 检查一个数是否为回文数的方法
  public static boolean isPalindrome(int number) {
      // 逻辑实现
      if(number%10==0) return false; //如果数字的末尾是0 则它不可能满足条件
      var numberString=Integer.toString(number);
      var reverseString=Integer.toString(reverse(number));
      return numberString.equals(reverseString);
    // 逻辑实现
  }
  // 反转数字
  public static int reverse(int number) {
      // 逻辑实现
      var string=Integer.toString(number);
      StringBuilder newString= new StringBuilder();
      for(int i=string.length()-1;i>=0;i--){
          newString.append(string.charAt(i));
      }
      return Integer.parseInt(newString.toString());

  }

  public static void main(String[] args) {
    int n = Integer.parseInt(args[0]);
    //int n = 114514;
    System.out.printf("从1到%-3d的回文数如下:\n", n);
    for (int i = 1; i < n; i++) {
      if (isPalindrome(i)) {
        System.out.print(i + " ");
      }
    }
  }
}