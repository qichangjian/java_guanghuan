package day4;

import java.util.Scanner;

/**
 * 任务五：
 * 数组查找操作：定义一个长度为10 的一维字符串数组，在每一个元素存放一个单词；然后运行时从控制台输入一个单词，程序判断数组是否包含有这个单词，包含这个单词就打印出“Yes”，不包含就打印出“No”。
 */
public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符：");
        char input = sc.nextLine().charAt(0);
        boolean flag = false;
        char[] a = {'a','b','c','d','e','f','g','h','i','g'};
        for (int i = 0; i < a.length; i++) {
            if(a[i] == input){
                System.out.println("Yes");
                flag = true;
            }
        }
        if(flag != true){
            System.out.println("No");
        }


    }
}
