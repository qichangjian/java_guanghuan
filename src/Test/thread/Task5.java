package Test.thread;

public class Task5 {
    public static void main(String[] args) {
        Qingfeng qingfeng =  new Qingfeng();
        Producer p = new Producer(qingfeng);
        Consumer c = new Consumer(qingfeng);
        Thread t1 = new Thread(p);
        Thread t2 = new Thread(c);
        t1.start();
        t2.start();
    }
}

class Qingfeng{
    private int count;
    boolean tag = false;

    //做包子
    synchronized public void put(int count) {
        //true
        if(tag){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //false
        this.count = count;
        System.out.println("生产了：" + this.count);
        tag = true;
        notify();
    }
    //卖包子
    synchronized public void get(){
        if(tag == false){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //true
        System.out.println("卖了：" + this.count);
        tag = false;
        notify();
    }
}

//生产
class Producer implements Runnable{
    Qingfeng qingfeng;
    Producer(Qingfeng qingfeng){
        this.qingfeng = qingfeng;
    }

    @Override
    public void run() {
        for (int i = 1; i < 5; i++) {
            qingfeng.put(i);
        }
    }
}
//销售
class Consumer implements Runnable{
    Qingfeng qingfeng;
    Consumer(Qingfeng qingfeng){
        this.qingfeng = qingfeng;
    }
    @Override
    public void run() {
        for (int i = 1; i < 5; i++) {
            qingfeng.get();
        }
    }
}