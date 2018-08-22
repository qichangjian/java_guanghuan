package day17.Task1;

public class Learn implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + "好好学习，天天向上");
        }
    }
}
