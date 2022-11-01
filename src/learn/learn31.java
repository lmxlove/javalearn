package learn;

/**
 * @author <lmx>
 * @since 2022/11/1 13:41
 */
public class learn31 {
  public static void main(String[] args) {
    People p=new People(){
        @Override//重写方法必须要有的注解
        public void run() {
           System.out.println("小学生跑的很慢");
        }
    };
    p.run();
  }
  abstract static class People{
      public  abstract void run();
  }
}
