package day10.Task5.Method2;


public class Main {
    public static void main(String[] args) {
        Fangdong fangdong = new Fangdong() {
            @Override
            public void rent() {
                System.out.println("房东开始找中介租房");
            }
        };
        Zhongjie zhongjie = new Zhongjie() {
            @Override
            public void rent() {
                System.out.println("中介开始代理租房");
                fangdong.rent();
                System.out.println("中介代理结束");
            }
        };
        System.out.println("匿名内部类的方式-----------------------");
        zhongjie.rent();
    }
}
