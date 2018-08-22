package Phase2.Task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入一个不多于5位的正整数：");
        String inputNum = sc.next();
        StringBuffer stringBuffer = new StringBuffer(inputNum);
        if(stringBuffer.length() <= 5){
            System.out.println("NUM:" + stringBuffer.length());
            System.out.println(stringBuffer.reverse());
        }else{
            System.out.println("输出超过了五位数");
        }

    }
}
