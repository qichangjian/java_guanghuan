package day17.Task2;

public class Main {
    public static void main(String[] args) {
        Apple appleThread = new Apple();
        Thread zhangsan = new Thread(appleThread,"张三");
        zhangsan.setPriority(Thread.MAX_PRIORITY);
        Thread lisi = new Thread(appleThread,"李四");
        lisi.setPriority(Thread.MIN_PRIORITY);
        zhangsan.start();
        lisi.start();
    }
}
