package day3;

import java.util.Scanner;

/**
 * 任务3：
 * 1.	根据月份，输出对应的季节，并输出至少两个描述该季节的成语和活动。
 */
public class Task23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入月份：");
        int input = sc.nextInt();
        switch (input) {
            case 12:
            case 1:
            case 2:
                System.out.println("冬天");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("春天");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("夏天");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("秋天");
                break;
            default:
                System.out.println("输入错误");
        }
    }
}
