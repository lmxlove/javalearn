package learn;

/**
 * @author <lmx>
 * @since 2022/10/30 11:39
 */
public class learn10 {
   static class Student {
    int stuCode;
    String stuName;
    int stuDeptCode;


      public  Student() {
      stuCode = 10011;
      stuName = "";
      stuDeptCode = 11;
    }

    protected  Student(String name, int sCode, int dCode) {
      stuCode = sCode;
      stuName = name;
      stuDeptCode = dCode;
    }

  }

  static class Student1 {
    public static void main(String[] args) {
      Student stu1;
      stu1 = new Student();
      stu1.stuName = "哈哈哈哈";
      Student stu2 = new Student("李", 100, 11);
      Student stu3=stu1;
      System.out.println(stu1==stu3);
      System.out.println(stu2.equals(stu1));
    }
  }
}
