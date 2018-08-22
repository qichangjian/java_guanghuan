package day3_2;

import java.util.Scanner;

/**
 * 任务四：能力提升题
 * 求和。S = n+nn+nnn+nnnn+……的值。
 * 要求控制台输入要加的数n和加的个数 .
 */
public class Task4 {
    public static void main(String[] args) {
        int beishu = 1;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("输入数字n:");
        int inputnum = sc.nextInt();
        int num = inputnum;
        int a = inputnum;
        System.out.println("输入个数：");
        int number= sc.nextInt();

        for (int i = 0; i < number; i++) {
            if(i == 0){
                sum += num;
            }else {
                beishu *= 10;
                a += num * beishu;
                sum += a;
            }
            System.out.println("数字是：" + a );
        }
        System.out.println("结果是：" + sum);

    }
}
