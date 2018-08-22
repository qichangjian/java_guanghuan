package day8.Task5.mon;

public class Monster {
    private String name;
    private double vitality;//生命力
    private double aggressivity;//攻击力

    public void attack(){
        System.out.println("怪兽" + name + "，生命力" + vitality + "，攻击力" + aggressivity);
    }
    public void move(){
        System.out.println("怪兽移动");
    }

    public Monster() {
    }

    public Monster(String name, double vitality, double aggressivity) {
        this.name = name;
        this.vitality = vitality;
        this.aggressivity = aggressivity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getVitality() {
        return vitality;
    }

    public void setVitality(double vitality) {
        this.vitality = vitality;
    }

    public double getAggressivity() {
        return aggressivity;
    }

    public void setAggressivity(double aggressivity) {
        this.aggressivity = aggressivity;
    }

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", vitality=" + vitality +
                ", aggressivity=" + aggressivity +
                '}';
    }
}
