package Test.thread;

import java.util.concurrent.locks.ReentrantLock;
//多线程实现小朋友报数 lock
/**
 *  * ReentrantLock 锁Lock
 *  *      定义锁 -- 加锁 -- 释放锁
 *  *      加入 try catch finally
 */
public class TestLock {
    public static void main(String[] args) {
        SayNums sayNum = new SayNums();
        Thread guojing = new Thread(sayNum,"郭靖");
        Thread yangkang = new Thread(sayNum,"杨康");
        Thread ouyangtong = new Thread(sayNum,"欧阳克");
        Thread zhoubotong = new Thread(sayNum,"周伯通");
        Thread huangrong = new Thread(sayNum,"黄蓉");
        guojing.start();
        yangkang.start();
        ouyangtong.start();
        zhoubotong.start();
        huangrong.start();
    }
}

class SayNums implements Runnable{
    private int num = 1;

    //锁   参数可以不加，如果加入： true公平锁(谁等待时间长，就让给谁)
    ReentrantLock lock = new ReentrantLock();
    @Override
    public void run() {
        //简单写法
        /*lock.lock();
        System.out.println(Thread.currentThread().getName() + (this.num++));
        lock.unlock();*/

        //安全写法
        try{
            //加锁
            lock.lock();
            System.out.println(Thread.currentThread().getName() + (this.num++));
        }catch (Exception e){

        }finally {
            //释放锁 要保证一定要释放，不然别的线程获取不到资源
            //所以要使用try catch finally
            lock.unlock();
        }
    }
}