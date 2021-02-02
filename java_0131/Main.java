package java_0131;
import com.sun.deploy.net.MessageHeader;

import java.util.Scanner;
import java.lang.String;
public class Main {
    public static void main(String[] args) {
        //先循环输入,再依次遍历，顺便核对，然后再输出
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.nextLine();
            StringBuffer stringBuffer = new StringBuffer();
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                String tmp = stringBuffer.toString();
                if (!tmp.contains(ch + "")) {
                    stringBuffer.append(String.valueOf(ch));
                }
            }
            System.out.println(stringBuffer);
        }
    }

}
