package Test.jihe.TestList.TestList_Dog;

public class Dog implements Comparable<Dog>{
    private String name;
    private String type;
    private int age;

    public Dog(String name, String type, int age) {
        this.name = name;
        this.type = type;
        this.age = age;
    }

    public Dog() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", age=" + age +
                '}';
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Dog o) {
        return  this.getAge() - o.getAge();
    }

}

