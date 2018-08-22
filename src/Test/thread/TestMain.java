package Test.thread;
//1,Thread
public class TestMain {
    public static void main(String[] args) {
        //获得主线程  Thread[main,5,main]线程名 优先级5中等  线程组
        System.out.println(Thread.currentThread());
        //修改线程名字
        Thread.currentThread().setName("abc");
        System.out.println("线程名修改后：" + Thread.currentThread());
    }
}
