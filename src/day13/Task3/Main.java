package day13.Task3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        User[] users = new User[3];
        users[0] = new User(22,"22",22);
        users[1] = new User(11,"11",11);
        users[2] = new User(33,"33",33);
        Arrays.sort(users);
        MyComparator myComparator = new MyComparator();
        Arrays.sort(users,myComparator);

    }
}
