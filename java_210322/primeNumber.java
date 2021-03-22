package java_210322;

public class primeNumber {
    public static void main(String[] args){
//  打印素数,首先要输入打印素数的范围.
//  素数的特性是只能被自身和1整除,
        for(int i=2;i<=100;i++){
            for(int j=2;j<i;j++){
                if (i%j==0) {
                    break;
                }
            }
           System.out.println(i);
        }
    }

}
