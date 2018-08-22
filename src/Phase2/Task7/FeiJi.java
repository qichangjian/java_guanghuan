package Phase2.Task7;

public class FeiJi implements Vehicles,Fly{
    @Override
    public void canTransport() {
        System.out.println("飞机能运输");
    }

    @Override
    public void fly() {
        System.out.println("飞机能飞");
    }
}
