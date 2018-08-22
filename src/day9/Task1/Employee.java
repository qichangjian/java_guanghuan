package day9.Task1;

public abstract class Employee {
    private String no;
    private String name;
    private double salay;

    public abstract void printJob();

    public Employee() {
    }

    public Employee(String no, String name, double salay) {
        this.no = no;
        this.name = name;
        this.salay = salay;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalay() {
        return salay;
    }

    public void setSalay(double salay) {
        this.salay = salay;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "no='" + no + '\'' +
                ", name='" + name + '\'' +
                ", salay=" + salay +
                '}';
    }
}
