package learn;
//构造函数与List的操作与filter过滤
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author <lmx>
 * @since 2022/10/30 20:56
 */
public class learn17 {
    private static class UserInfo {
        long stu_user;
        String stu_name;
        int stu_age;

        private UserInfo(long stu_user, String stu_name, int stu_age) {
            //这是一个构造函数，函数名与类名相同，当构造函数方法的
            // 参数与实例变量不相同时，this可以省略
            // 如果相同，this不能省略
            this.stu_name=stu_name;
            this.stu_user=stu_user;
            this.stu_age=stu_age;
        }

        private long getStu_user() {
            return stu_user;
        }

        private String getUserName() {
            return stu_name;
        }
        private int getAge(){
            return  stu_age;
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
      userInfoList.add(new UserInfo(1L, "捡田螺的小男孩", 18));
      userInfoList.add(new UserInfo(2L, "程序员田螺", 27));
      userInfoList.add(new UserInfo(3L, "捡瓶子的小男孩", 26));


      /**
       * filter 过滤，留下超过18岁的用户
       */
      List<UserInfo> userInfoResultList = userInfoList.stream().filter(user -> user.getAge() > 18).collect(Collectors.toList());
      userInfoResultList.forEach(a -> System.out.println(a.getUserName()));
  }
}
