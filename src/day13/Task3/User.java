package day13.Task3;

public class User implements Comparable<User>{
    private int no;
    private String name;
    private int number;

    public User() {
    }

    public User(int no, String name, int number) {
        this.no = no;
        this.name = name;
        this.number = number;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "User{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", number=" + number +
                '}';
    }

    @Override
    public int compareTo(User o) {
        return this.getNo()-o.getNo();
    }
}
