package day8.Task4;

public class Employee {
    private int id;
    private String sex;
    private String name;
    private String duty;
    private double salay;
    private int holidays;

    public void display(){
        System.out.println("员工姓名：" + name + "-员工性别：" + sex + "-员工职务：" + duty);
    }

    public int getDecMoney(int day){
        int salays=0;
        if(day <= 3){
            this.setSalay(this.getSalay()-30*day);
            salays = (int)this.getSalay()-30*day;
        }else{
            this.setSalay(this.getSalay()-50*day);
            salays = (int)this.getSalay()-50*day;
        }
        return salays;
    }

    public Employee() {
    }

    public Employee(int id, String sex, String name, String duty, double salay, int holidays) {
        this.id = id;
        this.sex = sex;
        this.name = name;
        this.duty = duty;
        this.salay = salay;
        this.holidays = holidays;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDuty() {
        return duty;
    }

    public void setDuty(String duty) {
        this.duty = duty;
    }

    public double getSalay() {
        return salay;
    }

    public void setSalay(double salay) {
        this.salay = salay;
    }

    public int getHolidays() {
        return holidays;
    }

    public void setHolidays(int holidays) {
        this.holidays = holidays;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", sex='" + sex + '\'' +
                ", name='" + name + '\'' +
                ", duty='" + duty + '\'' +
                ", salay=" + salay +
                ", holidays=" + holidays +
                '}';
    }
}
