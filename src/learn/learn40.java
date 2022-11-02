package learn;

/**
 * @author <lmx>
 * @since 2022/11/2 15:09
 */
public class learn40 {
    public static void main(String[] args) {
        learn39 learn39 = new learn39(10);
        learn37<learn39> learn39learn37 = new learn37<>(learn39);//创建一个圆锥对象
        learn39learn37.setHight(16);
        System.out.println(learn39learn37.computerVolume());
        learn38 learn38 = new learn38(15, 23);
        learn37<learn38> learn38learn37 = new learn37<>(learn38);//创建一个方锥对象
        learn38learn37.setHight(98);
        System.out.println(learn38learn37.computerVolume());

    }
}
