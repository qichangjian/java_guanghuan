package Test.thread;

public class TestSubThread8 {
    public static void main(String[] args) {
        ThreadDemo8 demo1 = new ThreadDemo8();
        demo1.tag = true;//不同的值所以要两个对象
        ThreadDemo8 demo2 = new ThreadDemo8();
        demo2.tag = false;
        Thread t1 = new Thread(demo1,"张三");
        Thread t2 = new Thread(demo2,"李四");
        t1.start();
        t2.start();
    }
}
class Zhangsan{
    public void say(){
        System.out.println("你给我书，我给你画");
    }
    public void get(){
        System.out.println("张三获得了书");
    }
}
class Lisi{
    public void say(){
        System.out.println("你给我画，我给你书");
    }
    public void get(){
        System.out.println("李四获得了画");
    }
}

class ThreadDemo8 implements Runnable{
    private static Zhangsan zhangsan = new Zhangsan();//同一个对象
    private static Lisi lisi = new Lisi();
    public boolean tag = false;

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "tag:" + tag);
        if(tag){
            synchronized(zhangsan){
                zhangsan.say();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (lisi){//需要获得李四对象的锁 ，李四锁在用着所以就等着
                    zhangsan.get();
                }
            }
        }else{
            synchronized (lisi){
                lisi.say();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (zhangsan){
                    lisi.get();
                }

            }
        }
    }
}