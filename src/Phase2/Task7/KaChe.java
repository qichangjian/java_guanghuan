package Phase2.Task7;

public class KaChe extends QiChe {
    @Override
    void canStop() {
        System.out.println("卡车能刹车");
    }

    @Override
    public void canTransport() {
        System.out.println("卡车能运输");
    }

    public void haveHuoCang(){
        System.out.println("卡车有货仓");
    }

    public void canLahuo(){
        System.out.println("卡车能拉货");
    }
}
