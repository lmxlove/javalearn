package learn;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author <lmx>
 * @since 2022/10/30 21:54
 */
public class learn20 {
  private static class UserInfo {
    long stu_user;
    String stu_name;
    int stu_age;


    private UserInfo(long l, String name, int i) {
      stu_user = l;
      stu_name = name;
      stu_age = i;

    }

    private long getStu_user() {
      return stu_user;
    }

    private String getUserName() {
      return stu_name;
    }

    private int getAge() {
      return stu_age;
    }
     //object要重写toString()方法,不然就是按照对象地址输出
    @Override
    public String toString() {
      return "UserInfo{" +
              "stu_user=" + stu_user +
              ", stu_name='" + stu_name + '\'' +
              ", stu_age=" + stu_age +
              '}';
    }//重写toString()方法
    //    public void setStu_user(long stu_user) {
    //      this.stu_user = stu_user;
    //    }

    //    public String getStu_name() {
    //      return stu_name;
    //    }

    //    public void setStu_name(String stu_name) {
    //      this.stu_name = stu_name;
    //    }

    //    public int getStu_age() {
    //      return stu_age;
    //    }

    //    public void setStu_age(int stu_age) {
    //      this.stu_age = stu_age;
    //    }
  }

  public static void main(String[] args) {
    List<UserInfo> userInfoList = new ArrayList<>();
    userInfoList.add(new UserInfo(1L, "捡田螺的小男孩", 18));
    userInfoList.add(new UserInfo(3L, "捡瓶子的小男孩", 26));
    userInfoList.add(new UserInfo(2L, "程序员田螺", 27));

    /** sorted + Comparator.comparing 排序列表， */
    userInfoList =
        userInfoList.stream()
            .sorted(Comparator.comparing(UserInfo::getAge))
            .collect(Collectors.toList());
    userInfoList.forEach(a -> System.out.println(a.toString()));

    System.out.println("开始降序排序");

    /** 如果想降序排序，则可以使用加reversed() */
    userInfoList =
        userInfoList.stream()
            .sorted(Comparator.comparing(UserInfo::getAge).reversed())
            .collect(Collectors.toList());
    userInfoList.forEach(a -> System.out.println(a.toString()));
  }
}
