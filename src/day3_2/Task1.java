package day3_2;
/**
 * 任务一：输出1-100之间的奇数和
 */
public class Task1 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i < 100; i=i+2) {
            sum += i;
        }
        System.out.println(sum);
    }
}
