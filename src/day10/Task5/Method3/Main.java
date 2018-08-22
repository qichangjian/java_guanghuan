package day10.Task5.Method3;

public class Main {
    public static void main(String[] args) {
        Rent fangdong = ()->{
            System.out.println("房东开始找中介租房...");
        };
        Rent zhongjie = ()->{
            System.out.println("中介开始代理租房...");
            fangdong.rent();
            System.out.println("中介代理结束...");
        };
        System.out.println("Lambda表达式的方式...");
        zhongjie.rent();
    }
}
