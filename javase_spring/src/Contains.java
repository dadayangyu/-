import java.util.Scanner;

public class Contains {
    /**
     * 题目:实现方法 contains
     * 题目描述:实现方法contains,能够判定字符串中是否包含子串
     * 查找字符串中相同的部分
    * */
    public static boolean myContains(String a, String b){
    //将字符串拆分成字符,使用CharArray()方法
    char[] Sa=a.toCharArray();
    char[] Sb=b.toCharArray();
    int c=Sa.length;
    int d=Sb.length;
        for(int i = 0; i < c; i++){
            boolean find = false;
            //进行查找下标匹配,并且要规范长度
            if(Sa[i] == Sb[0] && (i+d <= c)){
                int equalCount = 0;//这里一定要有个用来判断是否完全包含子串
                for (int j = 0; j < d; j++){
                    if(Sa[i+j] == Sb[j]){
                        equalCount++;
                    }
                }
                if(equalCount == d){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNextLine()){
            String str1=sc.nextLine();
            String str2=sc.nextLine();
            System.out.println(myContains(str1,str2));
        }
    }
}
