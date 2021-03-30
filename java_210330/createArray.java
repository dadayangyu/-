package java_210330;

public class createArray {
    /**
     * 题目:创建的数组,并且赋初值
     * 要求:创建一个int类型的数组,元素个数为100,并且把每个元素依次设置为1-100
     * 思路:按要求走
     */
    public static void main(String[] args){
       int[] array=new int[101];
       for(int i=1;i<=100;i++){
           array[i]=i;
           System.out.println(array[i]);
       }
    }
}
