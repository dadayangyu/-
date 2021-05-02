import java.util.Arrays;

class MyArray{
    public int[] array;
}
public class test06 {
    /**
     * 题目:交换两个数组
     * 题目描述:给定两个整形数组,交换两个数组的内容
     *
    * */
    public static void main(String[] args) {
        MyArray myArray1=new MyArray();
        myArray1.array=new int[]{1,2,3,4};
        MyArray myArray2=new MyArray();
        myArray2.array=new int[]{7,8,9,0};
        swap(myArray1,myArray2);
        System.out.println(Arrays.toString(myArray1.array));
        System.out.println(Arrays.toString(myArray2.array));
    }
    public static void swap(MyArray a,MyArray b){
        int[] tmp=a.array;
        a.array=b.array;
        b.array=tmp;
    }
}
