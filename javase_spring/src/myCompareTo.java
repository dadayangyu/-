import java.util.Scanner;

public class myCompareTo {
    /**
     * 题目:自己实现compareTo,能够实现按照字典序比较字符串大小
     * 暴力实现
    * */
    public static int myCompareTo(String a, String b) {
        //使用toCharArray的方法将一个字符串进行拆分成单个字符(需要知道toCharArray是在内部创建了一个新的字符数组并返回)
        char[] a1 = a.toCharArray();
        char[] b1 = b.toCharArray();
        int i = 0;
        //判断字符串是否能匹配上
        for (i = 0; i < a.length() && i < b.length(); i++) {
            if (a1[i] == b1[i]) {
                continue;
            }else {
                return a1[i] - b1[i];
            }
        }
        //当匹配上后自定义,当两个字符串长度相等时,返回0
        if (a.length() == b.length()) {
            return 0;
        }//当第一个字符串长度小于第二个字符串时,返回-1
        else if (a.length() < b.length()) {
            return -1;
        }//当第一个字符串长度大于第二个字符串长度时,返回1
        else {
            return 1;
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNextLine()){
            String str1=sc.nextLine();
            String str2=sc.nextLine();
            System.out.println(myCompareTo(str1,str2));
        }
    }
}
