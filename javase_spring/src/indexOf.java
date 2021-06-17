import java.util.Scanner;

public class indexOf {
    /**
     * 题目:实现方法indexOf
     * 题目描述:实现方法indexOf,能够找出字符串子串的位置
     * 思路:查找字符串,indexOf返回子字符串起始位置的下标,如果存在多个子字符串,返回最左边的结果的下标
     * 根据要求暴力实现
     * 特别注意:当要匹配的子串是空字符串时,假设返回0
    * */
public static int myIndexOf(String s, String a){
    if(a.length()==0){
        return 0;
    }
    int start=0;
    //for循环每个位置开始匹配
    for(int i=0;i+start<s.length();i++){
        //从首位开始比较
        while(i+start<s.length()&&start<a.length()){
            if(s.charAt(i+start)==a.charAt(start)){
                //匹配上的,则比较位置向后一位
                start++;
            }else{
                //不匹配,比较位置归0,跳出循环,i向后移动一位
                start=0;
                break;
                }
        }
        //如果比较位置超过了,匹配字符长度,则是已经匹配到
        if(start>=a.length()){
            return i;
        }
    }
    //没有匹配到,返回-1
    return -1;
}

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNextLine()){
            String str1=sc.nextLine();
            String str2=sc.nextLine();
            System.out.println(myIndexOf(str1,str2));
        }
    }
}
