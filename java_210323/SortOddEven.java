package java_210323;

public class SortOddEven {
    /**
    *题目:奇数位于偶数之前
     * 要求:调整数组顺序使得奇数位于偶数之前,调整之后,不关心大小顺序
     * 思路:首先设置一个大的循环,然后再从前往后找到偶数和在从后面往前找到奇数的位置进行交换
     *     先利用循环在left<right的条件下不停地找array[i]%2==0,找到后退出循环
     *     再利用循环在left<right的条件下不停地找array[i]%2!=0,找到后退出循环
     *     在3和4完成后,进行判断是否if(left<right),如果是则进行交换
    * */
    public static void sortOddEven(int[] array){
        int left=0;
        int right=array.length-1;//这里要注意
        while(left<right){//大循环
            while(array[left]%2==0&&left<right){
                left++;//从前往后找偶数
            }
            while(array[right]%2!=0&&left<right){
                right--;//从后往前找奇数
            }
            if(left<right){
                int temp=array[left];
                array[left]=array[right];
                array[right]=temp;
            }
        }
    }
    public static void print(int[] array){
        for(int i=0;i<array.length;i++){
            System.out.println("array["+i+"]="+array[i]+"");
        }
        System.out.println();
    }
    public static void main(String[] args){
        int[] arr={2,8,9,5,6,7};
        print(arr);
        sortOddEven(arr);
        print(arr);
    }
}
