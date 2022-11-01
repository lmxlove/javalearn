package learn;

/**
 * @author <lmx>
 * @since 2022/10/30 12:07
 */
public class learn11 {
  static class Student {
    int stuCode;
    String stuName;
    int deptCode;

    public Student() {}

    protected Student(String sName, int sCode, int dCode) {
      stuCode = sCode;
      stuName = sName;
      deptCode = dCode;
    }

    void setStuCode(int code) {
      stuCode = code;
    }

    void setDeptCode(int dCode) {
      deptCode = dCode;
    }

    public void printMaterial() {
      System.out.println("姓名: " + stuName);
      System.out.println("学号: " + stuCode);
      System.out.println("学院编号: " + deptCode);
    }
  }

  static class Student1 {
    public static void main(String[] args) {
      Student stu1 = new Student();
      stu1.stuName = "王菲";
      stu1.setStuCode(111);
      stu1.setDeptCode(1111);
      Student stu2=new Student("姐姐",11,12);
      stu1.printMaterial();
      stu2.printMaterial();
    }
  }
}
