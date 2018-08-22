package day10.Task5.Method1;

public class Zhongjie implements Rent {
    private Fangdong fangdong;

    public Zhongjie() {
    }

    public Zhongjie(Fangdong fangdong) {
        this.fangdong = fangdong;
    }

    @Override
    public void rent() {
        DailiRent();
        fangdong.rent();
        overRent();
    }

    private void DailiRent(){
        System.out.println("中介开始代理租房");
    }

    private void overRent(){
        System.out.println("中介代理结束");
    }
}
