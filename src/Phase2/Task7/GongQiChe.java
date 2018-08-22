package Phase2.Task7;

public class GongQiChe extends QiChe {
    @Override
    void canStop() {
        System.out.println("公共汽车能刹车");
    }

    @Override
    public void canTransport() {
        System.out.println("公共汽车能运输");
    }

    public void canBaoZhan(){
        System.out.println("公共汽车能报站");
    }

    public void youKecang(){
        System.out.println("公共汽车有客舱");
    }
}
