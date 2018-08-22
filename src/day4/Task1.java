package day4;

import java.lang.reflect.Array;

/**
 *任务一：
 * 一个5个数的数组，反转输出所有元素；
 * 例如： 33,1,4,67,8
 * 反转： 8,67,4,1,33
 */
public class Task1 {
    public static void main(String[] args) {
        int[] a = new int[]{33,1,4,67,8};
        int[] b = new int[5];

        for (int i = 0; i <a.length ; i++) {
            b[4-i] = a[i];
        }
        a = b;
        for (int aa:a) {
            System.out.println(aa);
        }
    }
}
