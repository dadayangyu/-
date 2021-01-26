package theNumberOf9;
import java.util.*;
public class xShape {
        public static void main(String[] args) {
            // TODO Auto-generated method stub
            Scanner sc=new Scanner(System.in);
            int t=sc.nextInt();
            for(int i=1;i<=t;i++)
            {
                for(int j=1;j<=t;j++)
                {
                    if((i==j)||(i+j==t+1))
                        System.out.print("* ");
                    else
                        System.out.print("  ");
                    if(j==t)
                        System.out.println( );
                }
            }
        }
}
