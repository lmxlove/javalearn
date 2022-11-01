package learn;

/**
 * @author <lmx>
 * @since 2022/11/1 9:30
 */
public class learn29 {
  static class test {

    @Override
    public int hashCode() {
      return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
      boolean oldResult = super.equals(obj);
      System.out.println("oldResult" + oldResult);

      return super.equals(obj);
    }

    public static void main(String[] args) {
      String s1 = "111";
      String s2 = "111";
      System.out.println("s1.equals(s2):  " + s1.equals(s2));

      String s= "";
      String t= "";
      System.out.println(s);
      String s3= "你好";
      String s4= "你好";
      String s5= "A";
      String s6= "a";
      System.out.println(s3.equals(s4));
      System.out.println(s5.equalsIgnoreCase(s6));//忽略字符串的字符序列大小写进行比较

    }
  }
}
