package Test.thread;

public class TestSubThread6 {
    public static void main(String[] args) {
        Bank bank = new Bank();//对象  同一对象的子线程都访问的同一个对象的资源money
        Thread zhangsan = new Thread(bank,"张三");
        Thread lisi = new Thread(bank,"李四");

        zhangsan.start();
        lisi.start();

        Bank bank1 = new Bank();
        Thread zhangsan1 = new Thread(bank1,"张三1");
        zhangsan1.start();


        //-----------------Thread不共享
        Bank1 bank11 = new Bank1("张三");
        Bank1 bank12 = new Bank1("李四");
        bank11.start();
        bank12.start();//线程没法共享money
    }
}

class Bank implements Runnable{
    private int money= 0;

    @Override
    public void run() {

        for (int i = 0; i < 3; i++) {
            //1.存钱 这样会出现延时错误
            setMoney();
            //修改：1.同步代码块synchronized（要锁的对象）
            /*synchronized (this){
                setMoney();
            }*/
        }
    }

    //存钱方法
    //2，修改同步方法 锁的是对象this
    synchronized public void setMoney(){
        this.money += 100;
        System.out.println("余额：" + Thread.currentThread().getName() + ":" + money);
    }
}

//继承Thread不能共享
class Bank1 extends Thread{
    private int money= 0;

    public Bank1(String name) {
        super(name);
    }

    @Override
    public void run() {

        for (int i = 0; i < 3; i++) {
            //1.存钱 这样会出现延时错误
            setMoney();
            //修改：1.同步代码块synchronized（要锁的对象）
            /*synchronized (this){
                setMoney();
            }*/
        }
    }

    //存钱方法
    //2，修改同步方法 锁的是对象this
    synchronized public void setMoney(){
        this.money += 100;
        System.out.println("余额：" + Thread.currentThread().getName() + ":" + money);
    }
}
