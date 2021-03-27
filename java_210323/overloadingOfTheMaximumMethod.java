package java_210323;
import java.util.Scanner;
public class overloadingOfTheMaximumMethod {
    /**
     * 题目:求最大值方法的重载
     * 要求:在同一个类中定义多个方法:要求不仅可以求两个整数的最大值,还可以求两个小数的最大值,以及两个小数和一个整数的大小关系
     * 思路:按要求走
    * */
    public static void main(String[] args){
        System.out.println("输入两个正数或三个数(两个整数一个小数)");
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        if(k==2){
            System.out.println("输入两个整数或两个小数或两个小数和一个整数");
            int a=sc.nextInt();
            int b=sc.nextInt();
            int num1=max(a,b);
            System.out.println("两个整数的最大值是:"+num1);
            double c=sc.nextDouble();
            double d=sc.nextDouble();
            double num2=max(c,d);
            System.out.println("两个小数的最大值为:"+num2);
        }else if(k==3){
            System.out.println("输入两个小数和一个整数");
            double e=sc.nextDouble();
            double f=sc.nextDouble();
            int g=sc.nextInt();
            double num3=max(e,f,g);
            System.out.println("这三个数中最大的数是:"+num3);
        }
    }
    public static int max(int a,int b){
        int m=a>b?a:b;
        return m;
    }
    public static double max(double c,double d){
        double m=c>d?c:d;
        return m;
    }
    public static double  max(double e,double f,int g){
        double m=(max(e,f)>g)?max(e,f):g;
        return m;
    }
}
