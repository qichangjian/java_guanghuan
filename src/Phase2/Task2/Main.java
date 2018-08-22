package Phase2.Task2;

import java.util.Random;
import java.util.Scanner;

public class Main {
    static int indexNum = 0;
    static int indexinput = 0;//记录最后一个添加进入数的下标
    static int bingoNum = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] randomNums = new int[7];
        int[] inputNums = new int[7];
        int random;
        int input;
        for (int i = 0; i < 7; i++) {
            random = new Random().nextInt(30) + 1;
            Boolean flag = true;
            //System.out.println(random);
            for (int j = 0; j < indexNum; j++) {
                if(random == randomNums[j]){
                    i--;
                    flag = false;
                    break;
                }
            }
            if(indexNum < 7 && flag == true){
                randomNums[indexNum] = random;
                indexNum ++;
            }

        }
        for (int s: randomNums) {
            System.out.println(s);
        }
        System.out.println("-------------------");
        for (int i = 0; i < 7; i++) {
            System.out.println("请输入1-30数：");
            input = sc.nextInt();
            Boolean flag = true;
            for (int j = 0; j < indexinput; j++) {
                if(input == inputNums[j]){
                    i--;
                    flag = false;
                    break;
                }
            }
            if(indexinput < 7 && flag == true){
                inputNums[indexinput] = input;
                indexinput ++;
            }
        }
        for (int s: inputNums) {
            System.out.println(s);
        }

        for (int i = 0; i < inputNums.length; i++) {
            for (int j = 0; j < randomNums.length; j++) {
                if(inputNums[i] == randomNums[j]){
                    bingoNum ++;
                    break;
                }
            }
        }
        System.out.println("猜对个数：" + bingoNum);
        if(bingoNum == 7){
            System.out.println("您中了一等奖：1个亿");
        }else if(bingoNum == 6){
            System.out.println("您中了二等奖：五千万");
        }else if(bingoNum == 5){
            System.out.println("您中了三等奖：一千万");
        }else{
            System.out.println("您没有中奖");
        }

    }
}
