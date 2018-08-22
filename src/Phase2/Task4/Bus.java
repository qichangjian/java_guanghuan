package Phase2.Task4;

public class Bus implements Vehicle {
    @Override
    public void start(int s) {
        System.out.println("BUS start:" + s);
    }

    @Override
    public void stop(int s) {
        System.out.println("BUS stop:" + s);
    }
}
