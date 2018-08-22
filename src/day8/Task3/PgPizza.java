package day8.Task3;

public class PgPizza extends Pizza {
    public void show(){
        System.out.println("培根Pizza：");
        super.show();
    }

    public PgPizza(String name, double price, String size) {
        super(name, price, size);
    }

    public PgPizza() {
    }
}
