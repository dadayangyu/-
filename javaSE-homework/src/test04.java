import java.util.Arrays;

public class test04 {
    /**
     * 题目:数组拷贝
     * 题目描述:实现一个方法copyOf,对一个整形数组进行拷贝,得到一个新的数组
     * 基础题
    * */
    public static int[] copyOf(int[] array,int[] array2){
       for(int i=0;i<array.length;i++){
           array2[i]=array[i];
       }
       return array2;
    }
    public static void main(String[] args){
        int[] array={1,2,3,4};
        int[] array2=new int[array.length];
        int[] ret=copyOf(array,array2);
        System.out.println(Arrays.toString(array2));
    }
}
