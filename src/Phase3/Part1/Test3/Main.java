package Phase3.Part1.Test3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] strings = inputs();
        StringBuffer stringBuffer = addTwo(strings);
        int sumNumber = addNum(stringBuffer);
        System.out.println("数字相加和：" + sumNumber);

    }
    public static String[] inputs(){
        Scanner scanner = new Scanner(System.in);
        String[] strings = new String[2];
        for (int i = 0; i < 2; i++) {
            System.out.println("请输入一个字符串：");
            if(scanner.hasNext()){
                strings[i] = scanner.next();
            }
        }
        return strings;
    }

    //拼接
    public static StringBuffer addTwo(String[] strings){
        StringBuffer s = new StringBuffer();
        for (int i = 0; i < strings.length; i++) {
            s.append(strings[i]);
        }
        return s;
    }
    //选出数组相加
    public static int addNum(StringBuffer stringBuffer){
        int sum = 0;
        char[] chars = stringBuffer.toString().toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if(chars[i] <= '9' && chars[i] >= '0'){
                sum += chars[i] - '0'; //char转换成整数类型
            }
        }
        return sum;
    }
}
