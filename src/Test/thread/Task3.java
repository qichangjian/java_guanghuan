package Test.thread;

import java.util.concurrent.locks.ReentrantLock;
//多线程实现小朋友报数 lock
/**
 *  * ReentrantLock 锁Lock
 *  *      定义锁 -- 加锁 -- 释放锁
 *  *      加入 try catch finally
 */
public class Task3 {
    public static void main(String[] args) {
        SayNum sayNum = new SayNum();
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

class SayNum implements Runnable{
    private int num = 1;

    ReentrantLock lock = new ReentrantLock();
    @Override
    public void run() {
        try{
            lock.lock();
            System.out.println(Thread.currentThread().getName() + (this.num++));
        }catch (Exception e){

        }finally {
            lock.unlock();
        }
    }
}