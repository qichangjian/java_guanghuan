package Phase2.Task4;

public class Bike implements Vehicle {
    @Override
    public void start(int s) {
        System.out.println("Bike start:" + s);
    }

    @Override
    public void stop(int s) {
        System.out.println("Bike stop:" + s);
    }
}
