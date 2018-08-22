package Phase2.Task3;

public class Rect {
    protected double width;
    protected double height;

    public Rect() {
        this.width = 10;
        this.height = 10;
    }

    public Rect(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public void area(){
        System.out.println("矩形的面积" + width * height);
    }

    public void perimeter(){
        System.out.println("矩形的周长：" + 2*(width+height));
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Rect{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
