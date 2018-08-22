package Test.jihe.TestList.TestListClass;


import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Student> school = new ArrayList<>();
        //初始化一大堆学生学生
        Student student = new Student("11",22,98,1);
        Student student1 = new Student("12",25,100,1);
        Student student2 = new Student("21",27,90,2);
        Student student3 = new Student("22",23,98,2);
        Student student4 = new Student("31",24,98,3);
        Student student5 = new Student("32",25,90,3);
        Student student6= new Student("33",26,94,3);
        school.add(student);
        school.add(student1);
        school.add(student2);
        school.add(student3);
        school.add(student4);
        school.add(student5);
        school.add(student6);

        //初始化三个班级用数组
        List<Student> class1 = new ArrayList<>();
        List<Student> class2 = new ArrayList<>();
        List<Student> class3 = new ArrayList<>();

        int allAge = 0;
        double allScore = 0;
        double class1Score = 0;
        double class2Score = 0;
        double class3Score = 0;
        int indexClass;
        for (int i = 0; i < school.size(); i++) {
            indexClass = school.get(i).getClassNum();
            if(indexClass == 1){
                class1.add(school.get(i));
                class1Score += school.get(i).getScore();
            }else if(indexClass == 2){
                class2.add(school.get(i));
                class2Score += school.get(i).getScore();
            }else{
                class3.add(school.get(i));
                class3Score += school.get(i).getScore();
            }
            allScore += school.get(i).getScore();
            allAge += school.get(i).getAge();
        }
        System.out.println("Class1");
        for (Student s:class1) {
            System.out.print(s);
        }
        System.out.println("\n Class2");
        for (Student s:class2) {
            System.out.print(s);
        }
        System.out.println("\n Class3");
        for (Student s:class3) {
            System.out.print(s);
        }
        System.out.println();
        System.out.println("最后输出-----------------");
        System.out.println("平均成绩：" + allScore/school.size());
        System.out.println("平均年龄：" + allAge/school.size());
        System.out.println("1班平均成绩：" + class1Score/class1.size());
        System.out.println("2班平均成绩：" + class2Score/class2.size());
        System.out.println("3班平均成绩：" + class3Score/class3.size());


    }
}
