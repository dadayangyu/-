package theNumberOf9;
import java.util.Scanner;
public class outputPrimeNumber {
     public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int i = sc.nextInt();
            int m=0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    m=1;
                    break;
                }
            }
            if(m==1||i==1||i==2||i==0||i<0)
                System.out.println("NO");
            else
                System.out.println("YES");
        }

       /*public static void main(String[] args){
           boolean flag;
           for(int i=2;i<=100;i++){
               flag=true;
               for(int j=2;j<=Math.sqrt(i);j++) {
                   if (i % j == 0) {
                       flag = false;
                       break;
                   }
               }
               if(flag==true){
                   System.out.print(" "+i);
               }
           }
       }

        */
}
