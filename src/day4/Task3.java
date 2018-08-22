package day4;
/**
 *任务三：
 * 一个6个数的数组，根据位置分为奇数和偶数两个数组；
 * 例如： 1,2,3,4,5,6  数组
 * 分为：
 * 1,3,5  数组1
 * 2,4,6  数组2
 */
public class Task3 {
    public static void main(String[] args) {
        int[] a = new int[]{1,2,3,4,5,6};
        int[] b = new int[a.length];
        int[] c = new int[a.length];
        int bCount = 0;
        int cCount = 0;
        for (int i = 0; i < a.length; i++) {
            if(a[i] % 2 == 1){
                b[bCount] = a[i];
                bCount++;
            }else{
                c[cCount] = a[i];
                cCount++;
            }
        }
        for (int bb:b) {
            if(bb != 0){
                System.out.println(bb);
            }
        }
        for (int cc:c) {
            if(cc != 0) {
                System.out.println(cc);
            }
        }
    }
}
