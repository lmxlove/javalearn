package learn;

/**
 * @author <lmx>
 * @since 2022/10/31 9:56
 */
// equals重写
public class learn22 {
  public static void main(String[] args) {
    int a1 = 1;
    int b1 = 1;
    String s1 = "abc";
    String s2 = "abc";
    String s3 = "111";
    String s4 = "111";
    String a = "as";
    String b = "as";
    String c = "as";
    String d = "as";
    a = "as";
    d = "as";
    String s5,s6;
    s5="we are family";
    s6= "we are family";
    System.out.println("a==b结果为" + (a == b));
    System.out.println("a==c结果为" + (a == c));
    System.out.println("a==d结果为" + (a == d));
    System.out.println("b==c结果为" + (b == c));
    System.out.println("b==d结果为" + (b == d));
    System.out.println("c==d结果为" + (c== d));
    System.out.println("----------------");
    System.out.println(" a.equals(b)结果为" + a.equals(b));
    System.out.println(" c.equals(b)结果为" + c.equals(b));
    System.out.println(" a.equals(d)结果为" + a.equals(d));
    System.out.println(" s5.equals(s6)结果为" + s5.equals(s6));
    System.out.println(a1 == b1);
    System.out.println(s1 == s2);
    System.out.println(s1.equals(s2));
    System.out.println(s3.equals(s4));
  }
}
