package learn;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * @author <lmx>
 * @since 2022/10/30 21:01
 */
public class learn18 {

  public static void main(String[] args) {
    /** forEach 遍历集合List列表 */
    List<String> userNameList = Arrays.asList("捡田螺的小男孩", "程序员田螺", "捡瓶子的小男孩");
    userNameList.forEach(System.out::println);

    HashMap<String, String> hashMap = new HashMap<>(16);
    hashMap.put("公众号", "捡田螺的小男孩");
    hashMap.put("职业", "程序员田螺");
    hashMap.put("昵称", "捡瓶子的小男孩");
    /** forEach 遍历集合Map */
    hashMap.forEach((k, v) -> System.out.println(k + ":\t" + v));
  }
}
