package day8.Task5.mon;

public class Centipede extends Monster {
    public void move(){
        System.out.println("蜈蚣怪兽飞行移动");
    }

    public Centipede() {
    }

    public Centipede(String name, double vitality, double aggressivity) {
        super(name, vitality, aggressivity);
    }
}
