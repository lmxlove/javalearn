package learn;
// 类变量和实例变量  和this关键字
/**
 * @author <lmx>
 * @since 2022/10/31 17:09
 */
public class learn28 {

  public static class learn {
    String i;//实例变量
    static int b;//类变量

    public String getI() {//实例方法
      return i;
    }

    public void setI(String j) {//这个是实例方法，实例变量与该实例方法的参数不一样
      // this可以省略   实例变量=实例方法参数
      i= j;
      //this能用于实例方法，不能用于类方法，带static的方法
      //  static int get(){}，可以访问实例变量
      //去掉this 得到的i是null
    }
//    public void setI(String i) {//这个是实例方法，实例变量与该实例方法的参数一样
//      // this不可以省略，如果省略，将取不到值，为null
//      i= i;
//      //this能用于实例方法，不能用于类方法，带static的方法
//      //  static int get(){}，可以访问实例变量
//      //去掉this 得到的i是null
//    }

    public int getB() {
      return b;
    }//实例方法不仅可以操着实例变量也可以操作类变量

    public void setB(int b) {
      b = b;//不能通过this访问类变量，静态成员
    }
  }

  public static class learn1 {
    public static void main(String[] args) {
      //类方法，类方法不能操作实例变量
      learn.b = 100; // 类变量不用new实例化就能访问，通过类名就能访问
      learn learn1 = new learn();//不能使用类名访问
      learn learn2 = new learn();
      learn1.setI("jj");
      learn2.setI("kk");
      System.out.println("1 "+learn1.getI());
      System.out.println("2 "+learn1.getB());
      System.out.println("3 "+learn2.getI());
      System.out.println("4 "+learn2.getB());
    }
  }
}
