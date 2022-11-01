package learn;

import java.util.Objects;

/**
 * @author <lmx>
 * @since 2022/10/31 10:18
 */
public class learn23 {
  public static class city<o> {
    String name;
    int age;

    public city(String name, int age) {
      // 有this和无this没有区别，在这里
      this.name = name;
      this.age = age;
    }

    // 重写equals

    @Override
    public boolean equals(Object o) {
      // 判断一下如果是同一个对象直接返回true，提高效率
      if (this == o) {
        return true;
      }
      // 非空性，如果传进来的对象为null或者二者为不同类，直接返回false
      if (o == null || getClass() != o.getClass()) {
        return false;
      }
      city city = (city) o;
      // 向下转型  o是父类  city是子类  把父类对象赋值给子类对象需要强制类型转换，称为向下造型，
      // 向下造型必须满足一个前提条件，父类对象必须是从子类对象向上造型过来的

      return age == city.age && Objects.equals(name, city.name);
    }

    @Override
    public int hashCode() {
      return Objects.hash(name, age);
    }
  }

  public static class test {
    public static void main(String[] args) {
      city city = new city("经济", 20);
      city city1 = new city("经济", 20);
      System.out.println(city == city1);
      System.out.println(city.equals(city1)); // false,没有重写equals前比较对象地址为false，重写之后比较对象的值为true
    }
  }
}
