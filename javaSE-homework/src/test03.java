import java.util.Arrays;

public class test03 {
    /**
     * 题目:二分查找
     * 题目描述:给定一个有序整形数组,实现二分查找
     * 基础题,必须很快很快写出来
    * */
    public static int binarySearch(int[] array,int key){
        int left=0;
        int right=array.length-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(key<array[mid]){
                right=mid-1;
            }else if(key>array[mid]){
                left=mid+1;
            }else{
                return array[mid];
            }
        }
        return -1;
    }
    public static void main(String[] args){
       int[] array={23,77,88,77,3};
       Arrays.sort(array);
       int ret=binarySearch(array,23);
       System.out.println(ret);
    }
}
