package day14.Task1;

public class Penguin {
    private String name;

    public Penguin() {
    }

    public Penguin(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Penguin{" +
                "name='" + name + '\'' +
                '}';
    }
}
