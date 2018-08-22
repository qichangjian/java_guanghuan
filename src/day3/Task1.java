package day3;

import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * 任务一： 计算成绩和人数。
 * 由用户输入多个学员成绩，当输入-1时结束循环，输出一共输入多少人，和输入的这些学员的总分数，不能把-1加进去。
 */
public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double allScore = 0;
        int allPeople = 0;
        double input = 0;
        do{
            System.out.println("请输入学生成绩：");
            input = sc.nextDouble();
            if(input>=0){
                allScore += input;
                allPeople ++;
            }else if(input == -1){
                break;
            }else{
                System.out.println("输入的成绩不合法。");
                continue;
            }
        }while(input != -1);
        System.out.println("总人数：" + allPeople + "\t总成绩：" + allScore);
    }
}
