package day14.Task2;

public class Mouse implements Comparable<Mouse> {
    private String name;
    private String hobby;
    private int age;

    public Mouse() {
    }

    public Mouse(String name, String hobby, int age) {
        this.name = name;
        this.hobby = hobby;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Mouse o) {
        return this.getAge() - o.getAge();
    }

    @Override
    public String toString() {
        return "Mouse{" +
                "name='" + name + '\'' +
                ", hobby='" + hobby + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        Mouse mouse = (Mouse)o;
        return mouse.getName() == this.getName();
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
