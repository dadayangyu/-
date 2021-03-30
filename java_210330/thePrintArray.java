package java_210330;
import java.util.Scanner;
import java.util.Arrays;
public class thePrintArray {
    /**
    *题目:打印数组
     *要求:实现一个方法printArray,以数组为参数,循环访问数组中每个元素,打印每个元素的值
     *思路:按照要求来
    * */
    public static void main(String[] args){
        int[] n={1,2,3};
        printArray(n);
    }
    public static void printArray(int[] array){
         for(int x:array){
             System.out.println(x);
         }
    }
}
