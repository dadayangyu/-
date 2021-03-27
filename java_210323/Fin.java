package java_210323;
import java.util.Scanner;
public class Fin {
    /**
    * 迭代实现菲波那切数列
     * 要求:迭代实现
     * 解决重点:迭代:interative(重复)循环执行,反复执行,每一次迭代的结果会作为下一次迭代的初始值
     *            利用变量的原值推出新值称为迭代，或着说迭代是函数内某段代码实现循环；
     *        迭代与递归的区别 :重复调用函数自身实现循环称为递归；迭代可以转换成递归但是递归不能转换成迭代
     *        能用迭代的就用迭代,递归因为不断调用函数,容易造成堆栈溢出
    **/
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入所要求的斐波那契数列最大数字n");
        int n=scanner.nextInt();
        for(int i=3;i<=n;i++){
            System.out.println(fin(i-1)+fin(i-2));
        }
    }
    public static int fin(int n){
        if(n==1||n==2){
            return 1;
        }
        return fin(n-1)+fin(n-2);
    }
}
