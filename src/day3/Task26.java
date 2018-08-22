package day3;

import java.util.Scanner;

/**
 *选做题：
 * 输入年月日，输出此日期是一年中的第几天，判断平年和闰年的情况。
 * 使用知识点：switch（不用循环）
 */
public class Task26 {
    public static void main(String[] args) {
        int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};//存储年份
        int allDays = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入年份：");
        int year = sc.nextInt();
        System.out.println("请输入月份：");
        int month = sc.nextInt();
        System.out.println("请输入日份：");
        int day = sc.nextInt();
        for (int i = 0; i < month -1; i++) {
            allDays += days[i];
        }
        allDays = allDays + day;//平年年份
        if(((year % 4 == 0 && year % 100 == 0) || year % 400 == 0) && month > 2){
            allDays ++;//闰年大于二月加一天
        }
        System.out.println("这是今年的第" + allDays + "天！");
    }
}
