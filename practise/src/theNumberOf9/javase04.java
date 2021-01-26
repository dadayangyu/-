package theNumberOf9;

public class javase04 {
    public static void main(String[] args){
     int m=0;
     for(int i=0;i<=100;i++){
         if(i%10==9)
             m++;
         if((i/10)%10==9)
             m++;
         if((i/100)%10==9)
             m++;
    }
     System.out.println("一共有"+m+"个9");
    }
}
