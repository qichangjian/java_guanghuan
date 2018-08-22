package Phase2.Task6;

public class Main {
    public static void main(String[] args) {
        ClassRoom cr = new ClassRoom();
        System.out.println(cr.toString());
        ClassRoom.Table table = cr.new Table();
        System.out.println(table.toString());
    }
}
