package Phase3.Part1.Test4;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        double sumScore = 0;
        double maxScore = 0;
        double minScore = 1000;
        Map<Student, Double> students= new HashMap<>();
        Student student1 = new Student(1,"小一","男",78);
        Student student2 = new Student(2,"小二","女",98);
        Student student3 = new Student(3,"小三","男",100);
        Student student4 = new Student(4,"小四","男",3);
        Student student5 = new Student(5,"小五","女",76);
        students.put(student1,student1.getScore());
        students.put(student2,student2.getScore());
        students.put(student3,student3.getScore());
        students.put(student4,student4.getScore());
        students.put(student5,student5.getScore());
        Iterator<Map.Entry<Student,Double>> iterator = students.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<Student,Double> s = iterator.next();
            sumScore += s.getValue();
            System.out.println("Key:" + s.getKey() + "|value:" + s.getValue());
            if(maxScore < s.getValue()){
                maxScore = s.getValue();
            }
            if(minScore > s.getValue()){
                minScore = s.getValue();
            }
        }
        System.out.println("平均分数：" + sumScore/students.size());
        System.out.println("最大分数：" + maxScore);
        System.out.println("最小分数：" + minScore);




    }
}
