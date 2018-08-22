package day7.Task1;

public class Student {
    private int id;
    private String sex;
    private String name;

    public static int mark(int day){
        return 1000 - day * 3;
    }

    public Student() {
    }

    public Student(int id, String sex, String name) {
        this.id = id;
        this.sex = sex;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", sex='" + sex + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
