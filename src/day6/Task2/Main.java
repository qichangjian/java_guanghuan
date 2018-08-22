package day6.Task2;

public class Main {
    public static void main(String[] args) {
        TrafficTool t = new TrafficTool(180,80);
        t.run();
        t.speedUp(100);
        t.run();
        t.speedDown(50);
        t.run();
    }
}
