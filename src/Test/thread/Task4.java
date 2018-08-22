package Test.thread;
//wait()一直等待 需要唤醒 notify() notifyAll()
public class Task4 {
    public static void main(String[] args) {
        NumberDemo demo = new NumberDemo();
        Thread t1 = new Thread(demo,"t1");
        t1.start();
        Thread t2 = new Thread(demo,"t2");
        t2.start();
    }
}
class NumberDemo implements Runnable{
    /*@Override
    synchronized public void run() {//线程过来等着
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
    }*/

    int i = 10;
    @Override
    synchronized public void run() {//线程过来等着
        for (; i >= 0; i--) {
            if(i == 5 && Thread.currentThread().getName().equals("t1")){
                try {
                    //Thread.sleep(1000);//休眠 放弃cpu执行权但是不会放弃锁
                    //wait(1000);//放弃cpu执行权 也放弃锁
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            System.out.println(Thread.currentThread().getName()+ " " + i);
            if(i == 0){
                notify();//行了还要等t2让出锁
                System.out.println("t1的wait被唤醒了");
            }
        }
    }
}
