package Test.thread;

//线程的其他方法
// 线程中断
public class TestInterrupt {
    public static void main(String[] args) {
        ThreadDemo2 demo = new ThreadDemo2();
        Thread t1 = new Thread(demo,"t1");
        Thread t2 = new Thread(demo,"t2");
        t1.start();
        t2.start();
        t1.interrupt();//中断t1  调用这个方法让sleep出现错误
        //t2.interrupt();
    }
}

class ThreadDemo2 implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "：" + i);
            if(i == 5){
                try {
                    Thread.sleep(5000); //等一秒你看不出来啊，中间登没登都不知道
                    //Thread.currentThread().join(6000);
                } catch (InterruptedException e) {//只有sleep和join才会出现这个异常
                    System.out.println("进入异常处理");
                }
            }
        }
    }
}
