package Test.fanxing.comparable;
import java.util.Arrays;
import java.util.Comparator;

public class Student implements Comparable<Student>{
    private int no;
    private String name;

    public Student(int no, String name) {
        this.no = no;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "no=" + no +
                ", name='" + name + '\'' +
                '}';
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

    //降序
    @Override
    public int compareTo(Student o) {
        /*if(this.no > o.no){
            return -1;
        }else if(this.no > o.no){
            return 1;
        }else{
            return 0;
        }*/
        return o.no - this.no;
    }

    public static void main(String[] args) {
        Student[] students = new Student[2];
        Student s1 = new Student(22,"22");
        Student s2 = new Student(33,"33");
        students[0] = s1;
        students[1] = s2;
        //Comparable
        Arrays.sort(students);
        for (Student student:students) {
            System.out.println(student.toString());
        }

        //自定义
        MyComparator myComparator = new MyComparator();
        Arrays.sort(students,myComparator);
        //System.out.print("2".compareTo("3"));

        //匿名内部类
        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getNo() - o2.getNo();
            }
        });
        //lambda表达式
        Arrays.sort(students,(o1,o2)->o1.getNo()-o2.getNo());
    }
}

//自定义比较器
class MyComparator implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        if(o1.getNo() > o2.getNo()){
            return 1;
        }else if(o1.getNo() < o2.getNo()){
            return -1;
        }else{
            if(o1.getName().compareTo(o2.getName()) > 0){
                return -1;
            }else if(o1.getName().compareTo(o2.getName()) < 0){
                return 1;
            }else{
                return 0;
            }
        }

    }
}
