package Test.thread;

//继承runable创建线程
class TestSunThread2 {
    public static void main(String[] args) {
        MyThread1  myThread1 = new MyThread1();//子线程
        Thread t1 = new Thread(myThread1);//Thread线程
        t1.start();

        MyThread1  myThread2 = new MyThread1();
        Thread t2 = new Thread(myThread1,"thread2");
        t2.start();
    }
}

class MyThread1 implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}