package java_201213;
import java.util.Scanner;

public class factorialSum {
    public static void main(String[] args) {
        /*
    //分为内外两层循环，内层循环求各个数的阶乘，外层循环求和(书写起来比较难)
    Scanner scanner=new Scanner(System.in);
    System.out.println("请输入所要求到的阶乘和最大数");
    int n=scanner.nextInt();
    int result=0;
    for(int num=1;num<=n;num++){
        int factorResult=1;
        for(int i=1;i<=num;i++){
            factorResult*=i;
        }
        result+=factorResult;
    }
   System.out.println(result);
    }
*/
      Scanner scanner=new Scanner(System.in);
      System.out.println("请输入阶乘数最大的那个数");
      int n=scanner.nextInt();
      int result=0;
      for(int num=1;num<=n;num++){
          result+=factor(num);
      }
        System.out.println(result);
        }
    public static int factor(int num){
        int factorResult=1;
        for(int i=1;i<=num;i++){
            factorResult*=i;
        }
        return factorResult;

    }
}
