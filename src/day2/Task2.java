package day2;

import java.util.Scanner;

/**
 * 任务二：
 * 要求：判断平年和闰年。
 * 闰年：能被4整除但不能被100整除或者能被400整除。
 * 知识点：条件运算符。
 */
public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要测试的年份：");
        int inputYear = sc.nextInt();
        if(isRunNian(inputYear)){
            System.out.println(inputYear + "是闰年！");
        }else{
            System.out.println(inputYear + "不是闰年");
        }

    }

    public static boolean isRunNian(int year){
        boolean flag = false;
        if(year % 100 != 0  && year % 100 == 0 || year % 400 == 0){
            flag = true;
        }
        return flag;
    }
}
