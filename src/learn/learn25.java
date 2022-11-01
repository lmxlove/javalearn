package learn;

import java.util.Date;

/**
 * @author <lmx>
 * @since 2022/10/31 11:36
 */
public class learn25 {
    public static class tv{
        double price;

        public void setPrice(double price) {
            this.price = price;
        }
        //重写toString()


        @Override
        public String toString() {
            String oldPrice=super.toString();
            //语句public string toString()在cpu中跑过后，会被隐藏掉，
            // 所以若想知道toString()方法的引用就必须用super重新调回，
            // 并把方法toString()的引用的字符串表示返回给字符对象oldPrice

            return oldPrice+"\n这是电视机，价格是:"+price;//重写toString()之后的
        }
    }
    public static class test{
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        tv tv = new tv();
        tv.setPrice(555.55);
        System.out.println(tv);//没有重写toString()learn.learn25$tv@6d6f6e28
    }
    }
}
