package day10.Task1;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.setSeatNumber(6);
        Car.Whool whool = car.new Whool("白色",4,"奔驰车轮");
        whool.show();
        car.show1();
    }


}
