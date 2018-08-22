package day3_2;
//打印空心菱形
public class Task22 {
    public static void main(String[] args) {
        print(8);
    }
    public static void print(int size) {
        if (size % 2 == 0) {
            size++; // 计算菱形大小
        }
        boolean isfirstorend = false;
        int i;
        int j;
        //图形上部分
        for (i = 0; i < size / 2 + 1; i++) {
            isfirstorend = false;
            for (j = 0; j < size / 2 - i; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (j = 0; j < 2 * i - 1; j++) {
                System.out.print(" ");
                isfirstorend = true;
            }
            if (isfirstorend) {// 判断是否是第一行
                System.out.print("*");
            }
            System.out.println();
        }
        //图形下部分
        for (i = 0; i < size / 2; i++) {
            isfirstorend = false;
            for (j = 0; j < i + 1; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (j = 0; j < 2 * (size / 2 - i - 1) - 1; j++) {
                System.out.print(" ");
                isfirstorend = true;
            }
            if (isfirstorend) {// 判断是否是最后一行
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
