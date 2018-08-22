package Test.jihe.TestPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
//Predicate 过滤器，removeif
public class TestPredicate {
    public static void main(String[] args) {
        //Predicate 过滤器，removeif
        List<Student> students = new ArrayList<>();
        students.add(new Student("zhangsan",22));
        students.add(new Student("lisi",44));
        students.add(new Student("wangwu",55));

        new TestPredicate().showStudent(students, new Predicate<Student>() {
            @Override
            public boolean test(Student student) {
                return student.getAge() > 30 && student.getName().contains("l");
            }
        });
        new TestPredicate().showStudent(students,t->t.getAge() > 30 && t.getName().contains("1"));
    }

    //(参数过滤器接口) 调用这个方法的时候实现了过滤器具体算法test
    public void showStudent(List<Student> stu, Predicate<Student> p){//Predicate<Student> p过滤器
        for (Student s:stu) {
            if(p.test(s)){
                System.out.println(s);
            }
        }
    }
}

class Student{
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
