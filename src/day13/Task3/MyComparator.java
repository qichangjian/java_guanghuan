package day13.Task3;

import java.util.Comparator;

public class MyComparator implements Comparator<User> {
    @Override
    public int compare(User o1, User o2) {
        return o2.getNo() - o1.getNo();
    }
}
