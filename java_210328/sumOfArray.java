package java_210328;
import java.util.Scanner;
public class sumOfArray{
    /**
     * 题目:数组所有元素之和
     * 要求:实现一个方法sum,以数组为参数,求数组所有元素之和
     * 思路:按要求走
    * */
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double[] n=new double[6];
        System.out.println("请输入6个double值");
        for(int i=0;i<6;i++){
            n[i]=sc.nextDouble();
        }
        double i=sum(n);
        System.out.println("元素之和为:"+i);
    }
    public static double sum(double[] array){
        double sum=0;
        for(int i=0;i<6;i++){
            sum+=array[i];
        }
        return sum;
    }
}

