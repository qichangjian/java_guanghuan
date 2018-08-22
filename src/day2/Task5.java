package day2;

import java.util.Scanner;

/**
 * 任务五
 * 要求：实现斐波那契序列
 * 又称黄金分割数列，指的是这样一个数列：0、1、1、2、3、5、8、13、21、34、…
 */
public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入在多少之前停止打印：");
        int stopNum = sc.nextInt();
        printQ(stopNum);
    }

    public static void printQ(int stopNum){
        int a1 = 0;
        int a2 = 1;
        int sum = 0;

        System.out.print("0\t1\t");
        while (sum < stopNum){
            sum = a1 + a2;
            if(sum < stopNum){
                System.out.print(sum + "\t");
            }
            a1 = a2;
            a2 = sum;
        }
    }
}
