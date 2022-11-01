package learn;
import java.util.Arrays;
import  java.util.Scanner;
/**
 * @author <lmx>
 * @since 2022/10/30 10:09
 */
public class learn3 {
    public static void main(String[] args) {
        System.out.println("args = " + Arrays.deepToString(args));
        Scanner reader=new Scanner(System.in);
        int number =reader.nextInt();
        System.out.println("用户输入的是:"+number);
    }
}
