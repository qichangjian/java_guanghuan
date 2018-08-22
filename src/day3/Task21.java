package day3;

import java.util.Scanner;

//任务1：控制台输入一个正整数，判断是否能被5整除；
public class Task21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入整数：");
        int inputNum = sc.nextInt();
        if(inputNum % 5 == 0){
            System.out.println("能被5整除");
        }else{
            System.out.println("不能被5整除");
        }
    }
}
