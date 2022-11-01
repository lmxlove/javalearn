package learn;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author <lmx>
 * @since 2022/10/30 21:04
 */
public class learn19 {
  private static class UserInfo {
    long stu_user;
    String stu_name;
    int stu_age;
    String stu_address;

    private UserInfo(long l, String name, int i, String country) {
      stu_user = l;
      stu_name = name;
      stu_age = i;
      stu_address = country;
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

    private String getCity(){
      return  stu_address;
    }

    @Override
    public String toString() {
      return "UserInfo{" +
              "stu_user=" + stu_user +
              ", stu_name='" + stu_name + '\'' +
              ", stu_age=" + stu_age +
              ", stu_address='" + stu_address + '\'' +
              '}';
    }
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
    List<UserInfo> originUserInfoList = new ArrayList<>();
    originUserInfoList.add(new UserInfo(1L, "捡田螺的小男孩", 18, "深圳"));

    originUserInfoList.add(new UserInfo(3L, "捡瓶子的小男孩", 26, "湛江"));
    originUserInfoList.add(new UserInfo(2L, "程序员田螺", 27, "深圳"));
    Map<String, List<UserInfo>> result =
        originUserInfoList.stream().collect(Collectors.groupingBy(UserInfo::getCity));
    System.out.println(result.toString());


  }


}
