package learn;

/**
 * @author <lmx>
 * @since 2022/11/2 15:04
 */
public class learn38 {
    double side1, side2, area;

    public learn38(double side1, double side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public String toString() {
        area = side1 * side2;
        return "" + area;
    }

}
