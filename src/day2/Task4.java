package day2;
/**
 * 任务四：
 * 要求：三个整数，升序排序。
 * 知识点：分支语句
 */
public class Task4 {
    public static void main(String[] args) {
        int[] a = new int[]{22,34,1};
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                if(a[i] > a[j]){
                    int temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;                }
            }
        }
        for (int aa : a) {
            System.out.print(aa + "\t");
        }
    }
}
