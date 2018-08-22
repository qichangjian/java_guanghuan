package day3;

import java.util.Scanner;

/**
 * 输入一个时间（整数）,在6-10点之间，输出“上午好”,在11-13点之间，输出“中午好”,在14-18点之间，输出“下午好”,其他情况输出“休息时间”(多重if)
 */
public class Task24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入时间：");
        int input = sc.nextInt();
        switch (input) {
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                System.out.println("上午好");
                break;
            case 11:
            case 12:
            case 13:
                System.out.println("中午好");
                break;
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                System.out.println("下午好");
                break;
            default:
                System.out.println("休息时间");
        }
    }
}
