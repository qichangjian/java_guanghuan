package Test.thread;
//线程的其他方法
// 线程让步

/**
 * 理论上让步给同等优先级的线程
 * 没有相等 让步给比他高的线程
 */
public class TestYield {
        public static void main(String[] args) {
            ThreadDemo3 demo = new ThreadDemo3();
            Thread t1 = new Thread(demo,"t1");
            Thread t2 = new Thread(demo,"t2");
            t1.start();
            t2.start();
        }
    }

class ThreadDemo3 implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "：" + i);
            if(i == 5 && Thread.currentThread().getName().equals("t1")){
                Thread.yield();//t1等于五的时候就让步，返回就绪状态，在抢夺cpu,其实没用
            }
        }
    }
}
