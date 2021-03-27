package java_210323;
import java.util.Scanner;
public class max {
    /**
    * 题目:求最大值
     * 要求:创建方法求两个数的最大值max2,随后再写一个求3个数的最大值函数max3
     *      在max3这个函数中,调用max2函数,来实现3个数的最大值计算
     * 思路:(考察重载)先写出max2这个函数
     *     再在max3中调用一次max2一次
     * */
      public static void main(String[] args){
          System.out.println("请输入三个数:");
          Scanner scanner=new Scanner(System.in);
          int a=scanner.nextInt();
          int b=scanner.nextInt();
          int c=scanner.nextInt();
          System.out.println(max3(a,b,c));

      }
      public static int max2(int a,int b){
          int i=a>b?a:b;
          return i;
      }
    public static int max3(int c,int d,int e){
        int m=(max2(c,d)>e)?max2(c,d):e;
        return m;
    }
}
