package day9.Task4;

public class Main {
    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit("美人","黑色","哺乳类");
        rabbit.eat();
        rabbit.voice();
        System.out.println("-----------------------------------------");
        Frog frog = new Frog("大兵","绿色","非哺乳类");
        frog.eat();
        frog.voice();
        frog.run();
    }
}
