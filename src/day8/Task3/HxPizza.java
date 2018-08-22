package day8.Task3;

public class HxPizza extends Pizza {
    public void show(){
        System.out.println("海鲜Pizza：");
        super.show();
    }

    public HxPizza() {
    }

    public HxPizza(String name, double price, String size) {
        super(name, price, size);
    }
}
