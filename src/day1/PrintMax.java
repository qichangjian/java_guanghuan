package day1;

import java.util.Scanner;

public class PrintMax {
    public static void main(String[] args) {
        int[] a = new int[3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            System.out.print("请输入" + (i+1) + "的值：");
            a[i] = sc.nextInt();
        }
        for (int j = 1; j < a.length; j++) {
            if(a[0]<a[j]){
                int temp = a[0];
                a[0] = a[j];
                a[j] = temp;
            }
        }
        System.out.println("最大值是：" + a[0]);
    }
}
