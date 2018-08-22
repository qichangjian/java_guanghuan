package day2;

/**
 * 任务三：
 * 要求：三个整数，求最大数。
 * 知识点：分支语句
 */
public class Task3 {
    public static void main(String[] args) {
        int[] a = new int[]{1,22,5};
        for (int i = 0; i < a.length ; i++) {
            if(a[0] < a[i]){
               int temp = a[i];
               a[i] = a[0];
               a[0] = temp;
            }
        }
        System.out.println("最大值是：" + a[0]);
    }
}
