package Test.thread;

public class TestSubThread4 {
    public static void main(String[] args) {
        ThreadDemo1 demo = new ThreadDemo1();
        Thread t1 = new Thread(demo,"t1");
        Thread t2 = new Thread(demo,"t2");

        //设置优先级10最大，但是不同操作系统等级划分不一样
        //t1.setPriority(10);
        t1.setPriority(Thread.MAX_PRIORITY);//最大
        //t1.setPriority(Thread.NORM_PRIORITY);//普通
        //t1.setPriority(Thread.MIN_PRIORITY);//最小
        t1.start();
        t2.start();

    }
}

class ThreadDemo1 implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 300; i++) {
            System.out.println(Thread.currentThread().getName() + "玩游戏");
        }
    }
}
