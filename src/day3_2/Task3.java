package day3_2;

import java.util.Scanner;

/**
 * 任务三：写一个程序，由用户输入一个整数，判断这个数是否是素数（素数：只能被1和本身整除的数）；
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
