package day8.Task2;

public class Bus extends Car {
    private String passengerCabin;
    private int passengerVolume;

    public void nwspaperStation(){
        System.out.println("公交车报站");
    }
    public void stopStation(){
        System.out.println("公交车停靠站");
    }
    public void travel(){
        System.out.println("公交车行驶");
    }
    public void brake(){
        System.out.println("公交车刹车");
    }

    public Bus() {
    }

    public Bus(String passengerCabin, int passengerVolume) {
        this.passengerCabin = passengerCabin;
        this.passengerVolume = passengerVolume;
    }

    public Bus(String engine, String wheel, String passengerCabin, int passengerVolume) {
        super(engine, wheel);
        this.passengerCabin = passengerCabin;
        this.passengerVolume = passengerVolume;
    }

    public String getPassengerCabin() {
        return passengerCabin;
    }

    public void setPassengerCabin(String passengerCabin) {
        this.passengerCabin = passengerCabin;
    }

    public int getPassengerVolume() {
        return passengerVolume;
    }

    public void setPassengerVolume(int passengerVolume) {
        this.passengerVolume = passengerVolume;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "passengerCabin='" + passengerCabin + '\'' +
                ", passengerVolume=" + passengerVolume +
                "} " + super.toString();
    }
}
