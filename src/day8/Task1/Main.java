package day8.Task1;

public class Main {
    public static void main(String[] args) {
        Car truck = new Truck();
        truck.brake();
        truck.travel();
        ((Truck) truck).dischargeGood();
        ((Truck) truck).pullGood();

        Car bus = new Bus();
        bus.travel();
        bus.brake();
        ((Bus) bus).stopStation();
        ((Bus) bus).nwspaperStation();

        Car car = new Car();
        car.brake();
        car.travel();

        Truck truck2 = new Truck();
        truck2.brake();
        truck2.travel();
        truck2.dischargeGood();
        truck2.pullGood();

        Bus bus2 = new Bus();
        bus2.brake();
        bus2.travel();
        bus2.nwspaperStation();
        bus2.stopStation();
    }
}
