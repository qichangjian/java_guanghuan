package day3;

import java.util.Scanner;

/**
 * 任务四：
 * 输入一批整数，使用循环求出最大值与最小值，输入0时结束
 */
public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max;
        int min;
        int inputNum;
        System.out.println("请输入要整数：（0:退出）");
        inputNum = sc.nextInt();
        max = inputNum;
        min = inputNum;
        while(inputNum != 0){
            System.out.println("请输入要整数：（0:退出）");
            inputNum = sc.nextInt();
            if(inputNum !=0 ){
                if(inputNum > max){
                    max = inputNum;
                }
                if(inputNum < min){
                    min = inputNum;
                }
            }
        }
        System.out.println("最大值：" + max + ",最小值：" + min);

    }
}
