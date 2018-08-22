package day3;

import java.util.Scanner;

/**
 * 任务三：
 * 判断一个数是否是素数。
 */
public class Task3 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("请输入一个数字：");
        int inputNum = sc.nextInt();
        boolean flag = true;
        for (int i = 2; i <= inputNum/2; i++) {
            if(inputNum % i == 0){
                flag = false;
                break;
            }
        }
        if (flag == true){
            System.out.println(inputNum + "是素数");
        }else{
            System.out.println(inputNum + "不是素数");
        }
    }
}
