package day2;
/**
 * 任务一：
 * 要求：310分钟是多少小时余多少分。
 * 知识点：运算符
 */
public class Task1 {
    public static void main(String[] args) {
        int allTime = 310;
        int hTime = allTime / 60;
        int mTime = allTime % 60;
        System.out.println("310分钟是：" + hTime + "小时" + mTime + "分钟！");
    }
}
