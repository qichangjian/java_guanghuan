package day8.Task1;

public class Truck extends Car{
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

}
