package learn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author <lmx>
 * @since 2022/11/2 13:22
 */
public class learn36 {
    public static void main(String[] args) {
        //
        List<Integer> statusList = Arrays.asList(1, 2);
        System.out.println(statusList);
        System.out.println(statusList.contains(1));
        System.out.println(statusList.contains(3));
//        statusList.add(3);使用工具类 Arrays.asList()把数组转换成集合时，不能使用其修改集合相关的方法，
//        它的 add/remove/clear 方法会抛出 UnsupportedOperationException 异常。
        System.out.println(statusList.contains(3));
        List<String> bookList = new ArrayList<>();
        bookList.add("遥远的救世主");
        bookList.add("背叛");
        bookList.add("天幕红尘");
        bookList.add("人生");
        bookList.add("平凡的世界");

        List<String> luyaoBookList = bookList.subList(3, 5);

        System.out.println(bookList);
        System.out.println(luyaoBookList);
        // 修改原集合的值,非结构性修改
        bookList.set(3, "路遥-人生");

        System.out.println(bookList);
        System.out.println(luyaoBookList);
        // 往原集合中添加元素  结构性修改
//        bookList.add("早晨从中午开始");
        //可以看出，当我们往原集合中添加了元素（结构性修改）后，
        // 在遍历子集合时，发生了ConcurrentModificationException异常。
        //
        //注意事项：以上异常并不是在添加元素时发生的，而是在添加元素后，遍历子集合时发生的

//        System.out.println(bookList);
//        System.out.println(luyaoBookList);
        // 修改子集合的值 非结构性修改
        luyaoBookList.set(1, "路遥-平凡的世界");

        System.out.println(bookList);
        System.out.println(luyaoBookList);
        // 往子集合中添加元素  结构性修改
        luyaoBookList.add("早晨从中午开始");

        System.out.println(bookList);
        System.out.println(luyaoBookList);
        //ArrayList的subList方法，返回的是原集合的一个子集合（视图），
        // 非结构性set方法修改任意一个集合的元素的值，
        // 都会彼此影响，结构性修改原集合时，
        // 会报ConcurrentModificationException异常，
        // 结构性add方法修改子集合时，会影响原集合，
        // 所以使用时要注意，避免程序错误或者异常
        //1、 修改原集合元素的值，会影响子集合；
        //2、 修改原集合的结构，会引起ConcurrentModificationException异常；
        //3、 修改子集合元素的值，会影响原集合；
        //4、 修改子集合的结构，会影响原集合；


    }
}
