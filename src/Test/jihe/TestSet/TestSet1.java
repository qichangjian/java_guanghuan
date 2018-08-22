package Test.jihe.TestSet;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Employee{
    private int no;
    private String name;

    public Employee(int no, String name) {
        this.no = no;
        this.name = name;
    }

    public Employee() {
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

    @Override
    public String toString() {
        return "Employee{" +
                "no=" + no +
                ", name='" + name + '\'' +
                '}';
    }


    //自己的方式完成去除重复方式
    @Override
    public boolean equals(Object o) {
        //obj转换成Employee//强制类型转换
        Employee e = (Employee)o;
        return this.name == e.name && this.no == e.no;
    }

    @Override
    public int hashCode() {
        return name.hashCode() + no;
    }
}
public class TestSet1 {
    public static void main(String[] args) {
        Set<Employee> employees = new HashSet<>();
        Employee zhangsan = new Employee(2,"zhangsan");
        Employee lisi = new Employee(3,"lisi");
        Employee wangwu = new Employee(1,"wangwu");
        Employee wangwu1 = new Employee(1,"wangwu");
        employees.add(zhangsan);
        employees.add(lisi);
        employees.add(wangwu);
        employees.add(wangwu);//去除了因为相同
        employees.add(wangwu1);//重写hashCode和equals方法后 这个也去除了，以前是比较地址
        employees.forEach(System.out::println);

        System.out.println();

    }
}
