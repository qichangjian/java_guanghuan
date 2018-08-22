package Test.jihe.TestList.TestList_Dog;


import java.util.Comparator;

public class MyComparator implements Comparator<Dog> {
    @Override
    public int compare(Dog o1, Dog o2) {
        return o2.getAge() - o1.getAge();
    }
}
