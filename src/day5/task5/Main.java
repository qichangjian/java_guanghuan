package day5.task5;

public class Main {
    public static void main(String[] args) {
        Draw d = new Draw(0,4);
        d.drawPra();
        System.out.println(d.toString());
        d.drawRec();
        System.out.println(d.toString());
        d.drawTrian();
        System.out.println(d.toString());
    }
}
