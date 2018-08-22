package day12.Task2;

public class Main {
    public static void main(String[] args) {
        Color c = new Color();
        try{
            c.setColor("黑");
        }catch (ColorException ce){
            System.out.println(ce.toString());
        }

    }
}
