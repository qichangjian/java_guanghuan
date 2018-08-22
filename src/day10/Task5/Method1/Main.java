package day10.Task5.Method1;

public class Main {
    public static void main(String[] args) {
        Fangdong fangdong = new Fangdong();
        Zhongjie zhongjie = new Zhongjie(fangdong);
        System.out.println("实现类的方式---------------------------");
        zhongjie.rent();
    }
}
