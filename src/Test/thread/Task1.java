package Test.thread;
/**每隔1秒显示线程名字
 *启动2个线程
 */
public class Task1 {
    public static void main(String[] args) {
        ThreadDemo4 demo4 = new ThreadDemo4(); //对象
        Thread thread1 = new Thread(demo4,"线程1");
        Thread thread2 = new Thread(demo4,"线程2");
        thread1.start();
        thread2.start();
    }
}

class ThreadDemo4 implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
