import java.util.Arrays;
import java.util.Scanner;

public class MySplit {
    public static void main(String[] args) {
        /**
         * 题目:实现方法split
         * 题目描述:实现方法split,能够指定分割符将字符串拆分成字符串数组
         * 注意:不必支持正则表达式
         * 思路:遍历查找到分隔符,把分隔符前面到上一次的位置之间的中间部分添加到list
         * 注意:如果没有找到,则返回自身
         *     是否添加剩余的内容到list
         *     是否去除list里面的空字符串
         *     从上面的list里面返回成数组
        * */
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        mySplit(str,".");
    }
    public static void mySplit(String str,String s) {
        int count=0;
        for(int i=0;i<str.length();i++){
            if(s.equals(String.valueOf(str.charAt(i)))){
                count++;
            }
        }
        String[] result=new String[++count];
        Arrays.fill(result,"");
        int t=0;
        for(int i=0;i<str.length();i++){
            if (!s.equals(String.valueOf(str.charAt(i)))) {
                result[t] += str.charAt(i);
            } else {
                t++;
            }
        }
        System.out.println(Arrays.toString(result));
    }
}
