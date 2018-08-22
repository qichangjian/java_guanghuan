package Test.trycatch;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] aa = new int[5];
        Scanner sc = new Scanner(System.in);
        try {
            for (int i = 0; i <aa.length ; i++) {
                System.out.println("输入：");
                aa[i] = sc.nextInt();
            }
        }catch (Exception e){
            System.out.println("赋值出错了");
        }
    }
}
