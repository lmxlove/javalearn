package learn;

/**
 * @author <lmx>
 * @since 2022/10/30 14:03
 */
public class learn15 {
  interface interface1 {
    int a = 1;

    static void show() {}
  }

  static class test implements interface1 {

    public static void show() {
      System.out.println("a=" + a);
    }
  }

  static class diaoyong {
    public static void main(String[] args) {
      test teat = new test();
      test.show();
    }
  }
}
