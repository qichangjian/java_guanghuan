package day10.Task1;

public class Car {
    private int seatNumber;

    //成员内部类
    class Whool{
        public String color;
        public int number;
        public String whoolMessage;

        public void show(){
            System.out.println("车是" + seatNumber + "座轿车：" + number + "个" + color + "" + whoolMessage);
        }

        public Whool(String color, int number, String whoolMessage) {
            this.color = color;
            this.number = number;
            this.whoolMessage = whoolMessage;
        }

        public Whool() {
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public int getNumber() {
            return number;
        }

        public void setNumber(int number) {
            this.number = number;
        }

        public String getWhoolMessage() {
            return whoolMessage;
        }

        public void setWhoolMessage(String whoolMessage) {
            this.whoolMessage = whoolMessage;
        }
    }

    public void show1(){
        Whool whool = new Whool("黑色",4,"大众车轮");
        System.out.println("车是" + seatNumber + "座轿车：" + whool.getNumber() + "个" + whool.getColor() + "" + whool.getWhoolMessage());
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public Car() {
    }

}
