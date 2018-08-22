package day6.Task2;

public class TrafficTool {
    private double speed;
    private double size;

    public TrafficTool() {
    }

    public TrafficTool(double speed, double size) {
        this.speed = speed;
        this.size = size;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public void run(){
        System.out.println("体积"+ this.size +"的交通工具以"+ this.speed +"的速度行驶；");
    }

    public void speedUp(double upSpeed){
        this.setSpeed(this.getSpeed() + upSpeed);
    }

    public void speedDown(double downSpeed){
        this.setSpeed(this.getSize() + downSpeed);
    }
}
