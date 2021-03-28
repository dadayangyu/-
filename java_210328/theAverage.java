package java_210328;
import java.util.Scanner;
public class theAverage {
    /**
     * 题目:求数组的平均值
     * 要求:实现一个方法avg,以数组为参数,求数组中所有元素的平均值(注意方法的返回值得类型)
     * 思路:先输入一个数组,单独写个方法对average进行求值
    * */
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double[] n=new double[6];
        System.out.println("请输入6个double型的值");
        for(int i=0;i<6;i++){
            n[i]=sc.nextDouble();
        }
        double i =average(n);
        System.out.println("平均值为:"+i);
    }
    public static double average(double[] array){
        double sum=0;
        for(int i=0;i<6;i++){
            sum+=array[i];
        }
       return sum/6;
    }
}
