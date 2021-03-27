package java_210323;
import java.util.Scanner;
public class factorial {
    public static void main(String[] args){
    Scanner scanner=new Scanner(System.in);
    System.out.println("请输入所要求阶乘的数字N");
    int N=scanner.nextInt();
    int factor=1;
    for(int i=1;i<=N;i++){
        factor*=i;
    }
    System.out.println(factor);
}
}
