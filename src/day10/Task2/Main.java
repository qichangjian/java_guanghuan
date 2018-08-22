package day10.Task2;

public class Main {
    public static void main(String[] args) {
        new Thread( () -> System.out.println("This is a Lambda expression!!") ).start();
    }
}
