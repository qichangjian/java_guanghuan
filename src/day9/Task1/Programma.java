package day9.Task1;

public class Programma extends Employee {
    @Override
    public void printJob() {
        System.out.println("程序员上班努力工作！！！");
    }

    public void lookBook(){
        System.out.println("看书");
    }

    public Programma() {
    }

    public Programma(String no, String name, double salay) {
        super(no, name, salay);
    }

    @Override
    public String toString() {
        return "Programma{} " + super.toString();
    }
}
