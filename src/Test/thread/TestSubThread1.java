package Test.thread;

//创建子线程

/**
 * 创建线程的两种方法
 * 1.继承Thread类
 * 2.实现runable接口
 */
public class TestSubThread1 {
    public static void main(String[] args) {
        /**继承Thread类*/
     /*
        //Thread
        //创建了一个线程对象
        Thread t = new Thread();
        //启动线程 只要主线程启动，子线程就处于就绪状态
        t.start();//run
    */

        //创建线程
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread("newThreadName");
        //启动线程 只能启动一次
        //t1.run();//只是调用主线程run 如果想要调用子线程的run必须调用start
        t1.start();//start的目的就是调用run()方法
        t2.start();

    }
}

//定义个一个线程类
class MyThread extends Thread{
    public MyThread() {
    }

    public MyThread(String name) {
        super(name);
    }

    //【子线程的功能就在run中】
    //子线程默认的名字Thread-0 1,2,3,4,5  主线程默认名字是main
    //主线程是产生其他子线程的线程
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            //System.out.println("Hello");
            System.out.println(Thread.currentThread().getName());
        }
    }
}
