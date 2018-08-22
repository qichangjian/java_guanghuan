package day8.Task2;

public class Truck extends Car {
    private String wareHouse;
    private double load;

    //拉货
    public void pullGood(){
        System.out.println("货车拉货");
    }
    //卸货
    public void dischargeGood(){
        System.out.println("货车卸货");
    }
    public void brake(){
        System.out.println("货车刹车");
    }
    public void travel(){
        System.out.println("货车行驶");
    }

    public Truck() {
    }

    public Truck(String wareHouse, double load) {
        this.wareHouse = wareHouse;
        this.load = load;
    }

    public Truck(String engine, String wheel, String wareHouse, double load) {
        super(engine, wheel);
        this.wareHouse = wareHouse;
        this.load = load;
    }

    public String getWareHouse() {
        return wareHouse;
    }

    public void setWareHouse(String wareHouse) {
        this.wareHouse = wareHouse;
    }

    public double getLoad() {
        return load;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "wareHouse='" + wareHouse + '\'' +
                ", load=" + load +
                '}';
    }

    public void setLoad(double load) {
        this.load = load;
    }
}
