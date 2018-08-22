package day8.Task2;

public class Car {
    private String engine;
    private String wheel;

    public void travel(){
        System.out.println("Car:行驶");
    }

    public void brake(){
        System.out.println("Car:刹车");
    }

    public Car() {
    }

    public Car(String engine, String wheel) {
        this.engine = engine;
        this.wheel = wheel;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getWheel() {
        return wheel;
    }

    public void setWheel(String wheel) {
        this.wheel = wheel;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine='" + engine + '\'' +
                ", wheel='" + wheel + '\'' +
                '}';
    }
}
