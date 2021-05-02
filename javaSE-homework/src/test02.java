public class test02 {
    /**
     * 题目:数组是否有序
     * 题目描述:给定一个整形数组,判定数组是否有序
     * 递增
     * 基础题,必须很快很快的写出来
    * */
    public static boolean isSorted(int[] array){
        for(int i=0;i<array.length;i++){
            if(array[i]>array[i+1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        int[] array=new int[]{1,34,4,2};
        System.out.println(isSorted(array));


    }
}
