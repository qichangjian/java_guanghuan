package day9.Task1;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager("001","赵三",8000,5000);
        manager.printJob();
        manager.playFootball();
        System.out.println(manager.toString());

        Programma programma = new Programma("111","李四",3000);
        programma.printJob();
        programma.lookBook();
        System.out.println(programma.toString());
    }
}
