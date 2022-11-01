package learn;
// super的用法
/**
 * @author <lmx>
 * @since 2022/10/31 16:27
 */
public class learn27 {

  static class sum {
    int n;

    float f() {
      float sum = 0;
      for (int i = 1; i <= n; i++) {
        sum = sum + i;
      }
      return sum;
    }
  }

  static class Average extends sum {
    int n;
//重写了父类的f()方法，即隐藏了继承来自父类的f()和成员，需要使用super关键字来调用
    @Override
    float f() {
      float c;
      super.n = n;
      c = super.f();
      return c / n;
    }

    float g() {
      float c;
      c = super.f();
      return c / 2;
    }
  }

  public static class test {
    public static void main(String[] args) {
      //sum.Average average = new sum.Average();
      Average average = new Average();
      average.n = 100;
      float result2 = average.g();
      float result1 = average.f();
      System.out.println("result1 " + result1);
      System.out.println("result2 " + result2);
    }
  }
}
