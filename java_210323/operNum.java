package java_210323;
import java.util.Scanner;
public class operNum {
    /**
     * 题目:求和的重载
     * 要求:在同一个类中,分别定义求两个整数的方法和三个小数之和的方法.并执行代码,求出结果
     * 思路:按照要求走
    * */
    public static void main(String[] args){
        System.out.println("请输入数字的个数是:");
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        if(k==2){
            System.out.println("请输入所要求和的两个整数或是三个小数:");
            int a=sc.nextInt();
            int b=sc.nextInt();
            int sum=add(a,b);
            System.out.println("两个整数的和为:"+sum);
        }
        else if(k==3){
            System.out.println("请输入所要求和的两个整数或是三个小数:");
            double c=sc.nextDouble();
            double d=sc.nextDouble();
            double e=sc.nextDouble();
            double sum1=add(c,d,e);
            System.out.println("三个小数的和为:"+sum1);
        }
    }
    public static int add(int a,int b){
        int sum=a+b;
        return sum;
    }
    public static double add(double c, double d, double e){
        double sum1=c+d+e;
        return sum1;
    }
}
