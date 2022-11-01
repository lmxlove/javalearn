package learn;

/**
 * @author <lmx>
 * @since 2022/10/30 13:28
 */
public class learn13 {
  static class Student {
    void printStuMessage() {
      System.out.println("a student");
    }
  }

  static class GraduateStudent extends Student {

    //        void printStuMessage() {
    //            super.printStuMessage();
    //        }

    @Override
    void printStuMessage() {
      System.out.println("a graduated student");//方法重写
    }

    void printStuMessage(String name) {
      System.out.println("a graduated student: " + name);//方法重载
    }

    //        @Override
    //        protected void finalize() throws Throwable {
    //            super.finalize();
    //        }
  }
   static class diaoayong{
    public static void main(String[] args) {
      Student s=new Student();
      s.printStuMessage();
      GraduateStudent g=new GraduateStudent();
      g.printStuMessage();
      g.printStuMessage("Tom");

    }
  }

}
