package day8.Task5.mon;

public class Snake extends Monster {

    //补血
    public void addVitality(){
        if (this.getVitality() < 10){
            System.out.println("生命力低于10,发动技能增加20血量");
            this.setVitality(this.getVitality() + 20);
        }
    }

    public void move(){
        System.out.println("蛇类怪兽曲线移动");
    }

    public Snake() {
    }

    public Snake(String name, double vitality, double aggressivity) {
        super(name, vitality, aggressivity);
    }
}
