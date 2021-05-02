public class test05 {
    /**
     * 题目:数组转字符串
     * 题目描述:实现一个方法toString,把一个整形数组
     * 转换为字符串,例如数组{1,2,3},返回的字符串"[1,2,3]"
     * 注意 逗号的位置和数量
     * 基础题
    * */
    public static String toString(int[] array){
        String ret="[";
        for(int i=0;i<array.length;i++){
            if(i!=array.length-1){
                ret+=array[i]+",";
            }else{
                ret+=array[i]+"]";
            }
        }
        return ret;
    }
    public static void main(String[] args){
        int[] array={1,2,3,4};
        String ret=toString(array);
        System.out.println(ret);
    }
}
