package learn;

/**
 * @author <lmx>
 * @since 2022/10/30 10:15
 */
public class learn4 {
    public static void main(String[] args) {
        System.out.println("1000之内的完全数为:");
        for(int i=1;i<1000;i++){
            int y=0;
            for(int j=1;j<i;j++){
                if(i%j==0){
                    y+=j;
                }
            }
            if(y==i){
                System.out.println(i);
            }

        }
    }
}
