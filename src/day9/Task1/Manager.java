package day9.Task1;

public class Manager extends Employee {
    private double bonus;

    @Override
    public void printJob() {
        //工作描述
        System.out.println("项目经理工作安排员工工作，喝茶，看报！！！");
    }

    public void playFootball(){
        System.out.println("踢足球");
    }

    public Manager() {
    }

    public Manager(double bonus) {
        this.bonus = bonus;
    }

    public Manager(String no, String name, double salay, double bonus) {
        super(no, name, salay);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "bonus=" + bonus +
                "} " + super.toString();
    }
}
