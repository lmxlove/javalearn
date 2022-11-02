package learn;

/**
 * @author <lmx>
 * @since 2022/11/2 15:06
 */
public class learn39 {
    double area, radius;

    public learn39(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {//重写object类的tostring方法

        area = radius * radius * Math.PI;
        return "" + area;
    }
}
