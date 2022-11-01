package learn;

import java.util.Objects;
// super与重写equals,toString
/**
 * @author <lmx>
 * @since 2022/10/31 13:27
 */
public class learn26 {
  public static class User {
    private String name;
    private int age;

    public User() {} // 无参构造

    public User(String name, int age) { // 有参构造
      this.name = name;
      this.age = age;
    }

    @Override
    // 重写toString
    public String toString() {
      return "User{" + "name='" + name + '\'' + ", age=" + age + '}';
    }

    @Override
    // 重写equals
    public boolean equals(Object o) {

      if (this == o) {
        return true;
      }
      if (!(o instanceof User)) {
        return false;
      }
      // String string = (String) o.toString();
      User user = (User) o;
      // 向下造型，把父类对象赋值给子类对象需要强制类型转换，Objects是父类  string是子类

      // 使用super回显之前没有重写equals比较的结果
      // 因为重写方法都默认被cpu隐藏掉了,重写方法都被隐藏，所以使用super回显
      // 在这里回显user对象的所有比较结果，因为传入的是user
      boolean isEquals = super.equals(user);
      // boolean isSame = super.equals(string);
      System.out.println("isEquals:回显之前new一个实例对象equals的比较结果 " + isEquals);
      // System.out.println("isSame:回显之前两个字符串的equals的比较结果 " + isSame);

      // 怎么return布尔值和字符串拼在一起,布尔值怎么转字符串
      return age == user.age && name.equals(user.name);
    }

    @Override
    // 重写hashCode
    public int hashCode() {
      return Objects.hash(name, age);
    }
  }

  public static void main(String[] args) {

    User u1 = new User("wangwu", 18);
    User u2 = new User("wangw", 28);
    User u3 = new User("wangwu", 18);
    User u4 = new User("wangwu1", 18);

    String s1, s2;
    s1 = "111";
    s2 = "111";
    System.out.println("u1.equals(u2) " + u1.equals(u2));
    // u1和u2值不同，返回false
    System.out.println("u1.equals(u3) " + u1.equals(u3));
    System.out.println("u3.equals(u4) " + u3.equals(u4));

    // u1和u2对象不同，但值相同，返回true
    System.out.println("s1.equals(s2) " + s1.equals(s2));
  }
}
