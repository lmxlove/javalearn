package learn;

/**
 * @author <lmx>
 * @since 2022/11/1 13:58
 */
public class learn32 {
  public static void main(String[] args) {
    //语言级别8不支持本地接口
//    @FunctionalInterface
//    interface People1{
//      void run();
//    }
//    People1 p=()->{
//      System.out.println("小学生跑的很慢");
//    };
  }
  abstract class People1{
    public  abstract void run();
  }
}
