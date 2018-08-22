package Test.fanshe.day19;

import java.lang.annotation.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) throws NoSuchFieldException {
        Class<Person> cp = Person.class;
        System.out.println("-------获取Person的方法,属性 ，构造，注解--------");
        System.out.println("注解--------");
        Annotation[] personAnno = cp.getDeclaredAnnotations();
        Annotation[] personAnno2 = cp.getDeclaredField("type").getAnnotations();
        Arrays.stream(personAnno).forEach(System.out::println);
        Arrays.stream(personAnno2).forEach(System.out::println);

        System.out.println("属性---------");
        Field[] personField = cp.getDeclaredFields();
        for (Field pf:personField) {
            System.out.println(pf.getName());
            System.out.println(pf.getType());
            System.out.println(Modifier.toString(pf.getModifiers()));//访问权限
        }
        System.out.println("方法---------");
        Method[] personMethod = cp.getDeclaredMethods();
        for (Method pm:personMethod) {
            System.out.println(pm.getReturnType());
            System.out.println(pm.getName());
            System.out.println(Modifier.toString(pm.getModifiers()));
            System.out.println(Arrays.toString(pm.getParameterTypes()));
        }
        System.out.println("构造方法-------");
        Constructor[] personConstructor = cp.getConstructors();
        for (Constructor pc:personConstructor) {
            System.out.println(Arrays.toString(pc.getParameterTypes()));
        }

        System.out.println("---------员工是注解-----------------");
        Class<Employee> ce = Employee.class;
        Annotation[] eann = ce.getAnnotations();
        Arrays.stream(eann).forEach(System.out::println);
        Annotation[] aa = ce.getDeclaredField("type").getAnnotations();
        Arrays.stream(aa).forEach(System.out::println);
    }
}
@PersonAnno(value = "Person父类")
class Person{
    private String name;
    @EmployeeAnno(value = "Employee")
    String type;

    public Person() {
    }

    public Person(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public void eat(String food,String data){
        System.out.println("在" + data + "吃" + food);
    }
}

class Employee extends Person{
    @EmployeeAnno(value = "Employeesss")
    String type;
    public void sing(){
        System.out.println("Employee sing() ...");
    }
}


@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Inherited
@interface PersonAnno{
    String value() default "Person";
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface EmployeeAnno{
    String value() default "普通员工";
}