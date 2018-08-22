package day7.Task2;

import java.util.Scanner;

public class RandomStudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = {"张三","李四","王五","赵六","黄七"};
        String input = null;
        int randomInt;
        do{
            System.out.println("是否抽奖：");
            input = sc.next();
            if(input.equals("n")){
                break;
            }
            randomInt = (int)(Math.random()*(4-0+1)+0);
            //System.out.println(randomInt);
            System.out.println(names[randomInt] + "中奖了！");
        }while(input.equals("y"));


    }
}
