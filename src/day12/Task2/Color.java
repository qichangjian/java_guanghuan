package day12.Task2;

public class Color {
    private String color;

    public void setColor(String color) throws ColorException {
        if(color.equals("红") || color.equals("黄") ||color.equals("蓝")){
            this.color = color;
        }else{
            throw new ColorException();
        }

    }
}
