package java_210323;
public class singleNumber {
    public static void main(String[] args){
        int[] arr1={1,3,2,2,3,4,4};
        int num=findNotDouble(arr1);
        System.out.println(num);
    }
//按照按位异或,使得输入的整数数组中出现一次的数字显示出来
    public static int findNotDouble(int a[]){
        int n=a.length;
        int result=a[0];
        int i;
        for(i=1;i<n;++i){
            result ^=a[i];
        }
        return result;
    }
}
