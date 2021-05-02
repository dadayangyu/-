import java.util.Arrays;

public class test01 {
    /**
     * 题目:冒泡排序
     * 题目描述:给定一个整形数组,实现冒泡排序
     * 升序排序
     * 基础题必须会写
    * */
    public static int[] bubbleSort(int[] array){
        boolean flag=false;
        for(int i=0;i<array.length-1;i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = 0;
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    flag = true;
                }
            }
            if (flag == false) {
                break;
            }
        }
        return array;

    }
    public static void main(String[] args){
        //冒泡排序的基本思想就是相邻元素之间相互比较
        //逐次选出最大的数(升序的前提),每次都会至少减少一次比较
        //代码优化方案:在比较之前判断数据是否有序
        int[] array={34,44,55,66,7,71,44};
        int[] ret=bubbleSort(array);
        System.out.println(Arrays.toString(ret));
    }
}
