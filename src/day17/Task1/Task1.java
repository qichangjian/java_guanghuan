package day17.Task1;

public class Task1 {
    public static void main(String[] args) {
        Learn learn = new Learn();
        Thread test1 = new Thread(learn);
        //test1.start();

        Thread zhangsan = new Thread(learn,"张三");
        zhangsan.setPriority(Thread.MAX_PRIORITY);
        Thread lisi = new Thread(learn,"李四");
        lisi.setPriority(Thread.MIN_PRIORITY);
        zhangsan.start();
        lisi.start();

    }
}
