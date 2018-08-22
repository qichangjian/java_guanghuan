package day3;

import java.util.Scanner;

/**
 * 任务5：
 * 请根据英文单词的第一个字母判断星期几，如果第一个字母是一样的，则继续判断第二个字母。例如如果第一个字母是S,则继续判断第二个字母，如果第二个字母是a,则输出“星期六”。星期的英文单词如下表所示。
 */
public class Task25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入英文字母：");
        String input = sc.next();
        char strInput = input.charAt(0);
        char strInput2 = input.charAt(1);
        switch (strInput) {
            case 'M':
                System.out.println("星期一");
                break;
            case 'T':
                if(strInput2 == 'u'){
                    System.out.println("星期二");
                }else if(strInput2 == 'h'){
                    System.out.println("星期四");
                }else{
                    System.out.println("输入错误");
                }
                break;
            case 'W':
                System.out.println("星期三");
                break;
            case 'F':
                System.out.println("星期五");
                break;
            case 'S':
                if(strInput2 == 'a'){
                    System.out.println("星期六");
                }else if(strInput2 == 'h'){
                    System.out.println("星期日");
                }else{
                    System.out.println("输入错误");
                }
                break;
            default:
                System.out.println("输入错误");
        }
    }
}
