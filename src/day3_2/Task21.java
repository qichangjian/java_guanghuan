package day3_2;

import java.util.Scanner;

//商场购物
public class Task21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int counts = 0;
        int allCounts = 0;
        for (int i = 1; i < 6; i++) {
            System.out.println("欢迎来到第" + i + "家商场！");
            for (int j = 0; j < 3; j++) {
                System.out.println("请输入购物金额：");
                counts += sc.nextInt();
            }
            System.out.println("第" + i + "家商场结账：" + counts + "元！");
            allCounts += counts;
            counts = 0;
        }
        System.out.println("总共结账：" + allCounts);
    }
}
