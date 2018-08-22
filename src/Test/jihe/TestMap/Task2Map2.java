package Test.jihe.TestMap;

import java.util.*;

public class Task2Map2 {
    public static void main(String[] args) {
        Map<String,Dog> dogMap = new HashMap<>();
        Dog dog1 = new Dog("旺旺","拉布拉多",2);
        Dog dog2 = new Dog("二哈","二哈",1);
        dogMap.put("旺旺",dog1);
        dogMap.put("二哈",dog2);
        System.out.println(dogMap);
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要查询的姓名：");
        String inputName = scanner.next();
//        Set<Map.Entry<String,Dog>> entrySet = dogMap.entrySet();
//        Iterator<Map.Entry<String,Dog>> iterator = entrySet.iterator();
//        while(iterator.hasNext()){
//            if(iterator.next().getKey().equals(inputName)){
//                System.out.println(iterator.next().getValue());
//            }
//        }
        //方法1
        dogMap.forEach((k,v) -> {
            if(k.equals(inputName)){
                System.out.println(v);
            }
        });
        //方法2
        System.out.println(dogMap.get(inputName));
    }
}

class Dog{
    private String name;
    private String type;
    private int age;

    public Dog() {
    }

    public Dog(String name, String type, int age) {
        this.name = name;
        this.type = type;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", age=" + age +
                '}';
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

    public void setAge(int age) {
        this.age = age;
    }
}
