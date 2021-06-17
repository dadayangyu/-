import java.util.Scanner;

public class MyReplace {
    /**
     * 题目:实现方法replace
     * 题目描述:实现方法replace,能够替换字符串中的某个部分
     * 思路:遍历找到相同的部分
     * 注意:要注意一些边界条件
     *     子字符串的长度小于主字符串的长度
     *     如果没有找到返回什么,返回原字符串
     *     要实现把所有子字符串出现的地方都进行替换
    * */
    public static String myReplace(String str1,String str2,String s) {
        String a = "";
        //记录下一次字符串的结尾位置
        int start = 0;
        for (int i = 0; i < str1.length(); i++) {
            if (i + str2.length() <= str1.length() && str2.equals(str1.substring(i, i + str2.length()))) {
                //要实现把所有子字符串出现的地方都进行替换
                a += str1.substring(start, i) + s;
                start = i + str2.length();
            }
        }
        if (start < str1.length()) {
            a += str1.substring(start, str1.length());
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            String str=sc.nextLine();
            System.out.println(myReplace(str,"abc","word"));
        }

    }
}
