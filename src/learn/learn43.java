package learn;

import java.util.Optional;

/**
 * @author <lmx>
 * @since 2022/11/2 17:21
 */
public class learn43 {
  public static void main(String[] args) {
    String id = null;
    Optional<Item1> item1 = ItemService1.getItemByid(id);
    System.out.println(item1.orElse(new Item1()).name);
  }

  public static class ItemService1 {
    public static Optional<Item1> getItemByid(String id) {
      return Optional.ofNullable("1".equals(id) ? new Item1() : null);
    }
  }

  static class Item1 {
    private String name;
    private String id;
    //系统默认调用无参构造函数，前提是你的类是无参的，
    // 否则会报错，和当前类自己没有定义一个构造函数
    //什么类都有一个默认无参构造函数
    //只是这个对象不能传参数，如果自己没有定义有参构造函数的话

    //        public Item1(String name) {
    //            this.name = name;
    //        }

    //        public Item1() {
    //
    //        }
  }
}
