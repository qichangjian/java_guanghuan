package Test.thread;

import java.util.concurrent.locks.ReentrantLock;

//买票线程练习

/**
 * ReentrantLock 锁Lock
 *      定义锁 -- 加锁 -- 释放锁
 *      加入 try catch finally
 */
public class Task2 {
    public static void main(String[] args) {
        //创建对象
        CarWindows carThread = new CarWindows();
        //创建线程
        Thread window1 = new Thread(carThread,"窗口1");
        Thread window2 = new Thread(carThread,"窗口2");
        window1.start();
        window2.start();
    }
}

class CarWindows implements Runnable{
    private int number = 20;

    //锁   参数可以不加，如果加入： true公平锁(谁等待时间长，就让给谁)
    ReentrantLock lock = new ReentrantLock(true);

    @Override
    public void run() {
        for (int i = 1; i < 11; i++) {
            /*synchronized(this){
                //getNumber();
                System.out.println(Thread.currentThread().getName() + "卖出" + number + "号票" + "|窗口余票:" + (11 - i) + "|总余票：" + number);
                this.number--;
            }*/

            //加锁后与synchronized效果相同
            try{
                //加锁
                lock.lock();
                System.out.println(Thread.currentThread().getName() + "卖出" + number + "号票" + "|窗口余票:" + (11 - i) + "|总余票：" + number);
                this.number--;
                return;
            }catch(Exception e){

            }finally {
                //释放锁 要保证一定要释放，不然别的线程获取不到资源
                //所以要使用try catch finally
                lock.unlock();
            }


        }
    }

    public void getNumber(){
        System.out.println(Thread.currentThread().getName() + "卖出" + number + "号票");
        this.number--;
    }
}
