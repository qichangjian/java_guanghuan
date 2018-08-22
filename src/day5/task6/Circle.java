package day5.task6;

public class Circle {
    private double redius;

    public double findArea(double redius){
        return Math.PI * (redius * redius);
    }

    public double getPerimeter(){
        return Math.PI * redius * 2;
    }

    public Circle() {
    }

    public Circle(double redius) {
        this.redius = redius;
    }

    public double getRedius() {
        return redius;
    }

    public void setRedius(double redius) {
        this.redius = redius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "redius=" + redius +
                '}';
    }
}
