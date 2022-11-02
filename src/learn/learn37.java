package learn;

/**
 * @author <lmx>
 * @since 2022/11/2 14:55
 */
public class learn37<E> {
    double hight;
    E bottom;//用泛型E声明了一个对象bottom

    public learn37(E b) {
        bottom = b;
    }

    public void setBottom(E bottom) {
        this.bottom = bottom;
    }

    public void setHight(double hight) {
        this.hight = hight;
    }

    public double computerVolume() {
        String s = bottom.toString();
        //泛型变量只能调用从object类继承的或重写的方法
        double area = Double.parseDouble(s);
        return 1.0 / 3.0 * area * hight;
    }

    ;
}
