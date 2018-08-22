package day4;

import java.util.Random;
import java.util.logging.SocketHandler;

/**
 *任务七： 能力提升
 * 将一个1-100之间的数不重复的存在一个长度为【98】的数组里，找到没有存入的数字。
 */
public class Task7 {
    static int[] a = new int[98];
    static int indexA = 0;
    public static void main(String[] args) {
        boolean whileflag = true;//跳出while循环的标志
        int returnflag;//return 返回标志

        //循环随机不重复填满数组，填满跳出
        Random randoms = new Random();
        while(whileflag){
            returnflag = inputNum(randoms.nextInt(100)+1);
            if(returnflag == -1){
                break;
            }
        }
        System.out.println("先随机不重复填满int数组，数组结果：");
        printArray();
        System.out.println("\t查询没有在数组中的两个数字是:");
        noInArray();

    }

    //循环随机不重复填满数组方法
    public static int inputNum(int random){
        int flag = 0;
        if(indexA < 98){
            for (int i = 0; i <= indexA; i++) {
                if(a[i] == random){
                    flag = 0;
                    return flag;
                }
                if(i == indexA){
                    //添加
                    a[indexA] = random;
                    indexA ++;
                    flag = 1;
                    return flag;
                }
            }
        }else{
            flag = -1;
            return flag;
        }
        return flag;
    }

    //没在数组中剩余两个数的算法
    public static void noInArray(){
        for (int i = 1; i <= 100; i++) {
            int j;
            for (j = 0; j < a.length; j++) {
                if(a[j] == i){
                    break;
                }
            }
            if(j == a.length){
                System.out.print(i + "  ");
            }
        }
    }

    //打印数组
    public static void printArray(){
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
