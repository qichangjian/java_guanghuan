package day5.task6;

public class PassObject {
    private Circle c;

    public void  printAreas(Circle c,int time){
        System.out.println("Redius\tArea");
        for (int i = 0; i <= time; i++) {
            if (i > 0){
                System.out.println(i + "\t" + c.findArea(i));
            }
        }
    }

    public PassObject(Circle c) {
        this.c = c;
    }

    public PassObject() {
    }

    public Circle getC() {
        return c;
    }

    public void setC(Circle c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return "PassObject{" +
                "c=" + c +
                '}';
    }
}
