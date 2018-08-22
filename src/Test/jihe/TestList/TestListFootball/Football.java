package Test.jihe.TestList.TestListFootball;

public class Football {
    private String name;

    public Football(String name) {
        this.name = name;
    }

    public Football() {
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Football{" +
                "name='" + name + '\'' +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }
}
