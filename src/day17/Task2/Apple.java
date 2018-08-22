package day17.Task2;

public class Apple implements Runnable {
    private int number = 6;
    @Override
    public void run() {

        for (int i = 0; i < 3; i++) {
            synchronized (this){
                ff();
            }
        }
    }

    public void ff(){
        System.out.println(Thread.currentThread().getName() + ":" + number--);
    }
}
