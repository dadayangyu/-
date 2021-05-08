package day_17;

import java.util.Scanner;

public class test1 {
/**
 * 题目:iNOC产品部-杨辉三角的变形(华为oj)
 * 题目描述:数阵,第一行只有一个数1,以下每行的每个数,是恰好是它上面的数
 * 左上角数到右上角的数,3个数之和(如果不存在某个数,认为该数就是0)
 * 求第N行第一个偶数出现的位置.如果没有偶数,则输出-1,例如输入3,则输出2,输入4则输出3
 * 输入n(n<=1000000000)
 * 输入描述:输入一个int整数
 * 输出描述:输出返回int值
 * 思路:二维数组map的第0行和第n列都为0,想象将杨辉三角的数都左对齐
 *     这样下面一行的数等于上面一行同一位置的数及其前面两个数之和
 *     查找第一个偶数时只需要判断前n个即可
 *     查找这个代码错误原因
* */
public static int getFirstEven(int n){
    int[][] map=new int[n+1][2*n];
    map[1][1]=1;
    //将杨辉三角进行左对齐
    for(int i=2;i<=n;i++){
        map[i][1]=1;
        for(int j=2;j<=2*i-1;j++){
            map[i][j]=map[i-1][j-2]+map[i-1][j-1]+map[i+1][j];
        }
    }
    //查找第一个偶数并进行判断是前n个?判断N
    for(int i=2;i<n;i++){
        if(map[n][i]%2==0){
            return i;
        }
    }
    return -1;
}
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    while(sc.hasNext()){
        int n=sc.nextInt();
        System.out.println(getFirstEven(n));
    }
}
}
