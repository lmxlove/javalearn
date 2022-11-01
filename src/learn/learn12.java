package learn;

/**
 * @author <lmx>
 * @since 2022/10/30 12:56
 */
public class learn12 {
  static class Student {
    public int stu_no;
    public String stu_name;

    void setStu_no(int no) {
      stu_no = no;
    }

    void setStu_name(String name) {
      stu_name = name;
    }

    @Override
    public String toString() {
      String s;
      s = "学号: " + stu_no + ";姓名: " + stu_name;
      return s;
    }
  }

  static class GraduateStudent extends Student {
    public String tutor;
    public  String spec_direction;
    void setTutor(String stu_tutor){

      tutor=stu_tutor;
    }
    void setSpec_direction(String direction){
      spec_direction=direction;

    }
  }
  static class DiaoYong{
    public static void main(String[] args) {
      GraduateStudent stu1=new GraduateStudent();
      stu1.setStu_no(1001);
      stu1.setStu_name("哈哈哈");
      stu1.setTutor("急急急");
      stu1.setSpec_direction("京津冀");
      System.out.println(stu1.toString() +";研究方向: "+stu1.spec_direction+";导师:"+stu1.tutor+";");
    }
  }
}
