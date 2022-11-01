package learn;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class learn16 {

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
    userInfoList.add(new UserInfo(1L, "小男孩", 18));
    userInfoList.add(new UserInfo(2L, "田螺", 25));
    userInfoList.add(new UserInfo(3L, "小男孩", 26));

    /**
     * list 转 map 使用Collectors.toMap的时候，如果有可以重复会报错，所以需要加(k1, k2) -> k1 (k1, k2) -> k1
     * 表示，如果有重复的key,则保留第一个，舍弃第二个
     */
    Map<Long, UserInfo> userInfoMap =
        userInfoList.stream()
            .collect(Collectors.toMap(UserInfo::getStu_user, userInfo -> userInfo, (k1, k2) -> k1));
    userInfoMap.values().forEach(a -> System.out.println(a.getUserName()));
  }
}
