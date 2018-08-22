package day3;

import java.util.Scanner;

/**
 * 任务2：输入一个0-6的整数，0表示星期日，输出相应的星期几，输入错误则提示‘输入有误’。(switch)
 */
public class Task22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入（0-6）整数：");
        int input = sc.nextInt();
        switch (input){
            case 0:
                System.out.println("今天是星期天");
                break;
            case 1:
                System.out.println("今天是星期1");
                break;
            case 2:
                System.out.println("今天是星期2");
                break;
            case 3:
                System.out.println("今天是星期3");
                break;
            case 4:
                System.out.println("今天是星期4");
                break;
            case 5:
                System.out.println("今天是星期5");
                break;
            case 6:
                System.out.println("今天是星期6");
                break;
            default:
                System.out.println("输入错误");
        }

    }
}
