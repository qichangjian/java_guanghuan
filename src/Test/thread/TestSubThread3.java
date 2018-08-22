package Test.thread;

public class TestSubThread3 {
    public static void main(String[] args) throws InterruptedException {
        ThreadDemo demo = new ThreadDemo();//子线程

        Thread zhangsan = new Thread(demo,"张三");
        Thread lisi = new Thread(demo,"李四");
        //这两个子线程执行顺序不一定
        zhangsan.start();//子线程
        lisi.start();
        //第一种阻塞状态 sleep 和 join
        //1.等待
        /*Thread.sleep(1000);//主线程等待1秒执行 时间不确定，等多少时间*/
        //2.少等一会 isAlive()当前线程是否处于运行状态 是true
        /*if(zhangsan.isAlive() || lisi.isAlive()){
            Thread.sleep(10);//还有人就等一会
        }*/
        //让其他线程先执行
        /** 当在主线程中调用了子线程的join方法，主线程就处于阻塞状态，
        等子线程都执行完了，主线程再执行*/
        zhangsan.join();
        lisi.join();
        System.out.println("main结束了");//主线程这一段代码不一定在后边 所以加上Thread.sleep（1000）
    }
}

class ThreadDemo implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 300; i++) {
            System.out.println(Thread.currentThread().getName() + "玩游戏");
        }
    }
}