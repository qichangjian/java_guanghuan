package day13.Task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你喜欢的季节：");
        Season season = Season.valueOf(sc.next());
        switch (season){
            case CHUN:
                System.out.println("春暖花开");
                break;
            case XIA:
                System.out.println("夏日炎炎");
                break;
            case QIU:
                System.out.println("秋高气爽");
                break;
            case DONG:
                System.out.println("冬日雪飘");
                break;
        }
    }
}
