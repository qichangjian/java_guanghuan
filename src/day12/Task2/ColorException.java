package day12.Task2;

public class ColorException extends Exception {

    @Override
    public String toString() {
        return "颜色只能是红、黄、蓝";
    }
}
