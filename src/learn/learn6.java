package learn;

/**
 * @author <lmx>
 * @since 2022/10/30 10:32
 */
public class learn6 {
    public static void main(String[] args) {
        int[] array={1,5,8,9,7,2,3,10,5,55,89,6,0,-5,5,-2};
        System.out.print("数组排列前的顺序为: ");
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        //冒泡排序
        int temp;
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array.length-i-1;j++){
                if(array[j]>array[j+1]){
                    temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }

            }
        }
        System.out.println();
        System.out.print("数组排列后的顺序为: ");
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }


    }
}
