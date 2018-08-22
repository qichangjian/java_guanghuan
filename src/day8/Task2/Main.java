package day8.Task2;

public class Main {
    public static void main(String[] args) {
        Car truck = new Truck("卡车发送机","卡车轮子","卡车货仓",1000);
        truck.brake();
        truck.travel();
        ((Truck) truck).dischargeGood();
        ((Truck) truck).pullGood();
        System.out.println(truck.toString());

        Car bus = new Bus("货车发送机","货车轮子","货车客舱",40);
        bus.travel();
        bus.brake();
        ((Bus) bus).stopStation();
        ((Bus) bus).nwspaperStation();
        System.out.println(bus.toString());

        Car car = new Car("车发送机","车轮子");
        car.brake();
        car.travel();
        System.out.println(car.toString());


    }
}
