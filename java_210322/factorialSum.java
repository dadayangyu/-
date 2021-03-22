package java_210322;
import java.util.Scanner;
public class factorialSum {
    //阶乘求和：两步，分别是求阶乘和求和
    //先输入所要求的阶乘的最大数
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入阶乘的最大数");
        int n=scanner.nextInt();
        int result=0;
        for(int i=1;i<=n;i++){
            result+=factor(i);
        }
        System.out.println(result);
    }
    public static int factor(int i){
        int sum=1;
        for(int j=1;j<=i;j++){
            sum*=j;
        }
        return sum;
    }
}
