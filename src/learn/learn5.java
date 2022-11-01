package learn;
import java.util.Scanner;
/**
 * @author <lmx>
 * @since 2022/10/30 10:23
 */
public class learn5 {
    public static void main(String[] args) {
        int i;
        int x;
        Scanner in=new Scanner(System.in);
        i=in.nextInt();
        x=i-1;
        while(x>0){
            if(i%x==0){
                break;
            }
            x--;
        }
        System.out.println(i+"的最大真约数是"+x);
    }
}
