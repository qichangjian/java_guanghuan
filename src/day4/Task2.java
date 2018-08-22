package day4;
/**
 *任务二：
 * 两个5个数的数组，两个数组对应的元素相加后输出；
 * 例如： 1,2,3,4,5  数组1
 *        2,3,4,5,6  数组2
 * 加后：3,5,7,9,11
 */
public class Task2 {
    public static void main(String[] args) {
        int[] a = new int[]{1,2,3,4,5};
        int[] b = new int[]{2,3,4,5,6};
        int[] c = new int[5];
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i] + b[i];
        }
        for (int cc:c) {
            System.out.println(cc);
        }
    }
}
