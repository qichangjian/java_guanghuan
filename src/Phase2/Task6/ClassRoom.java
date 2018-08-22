package Phase2.Task6;

public class ClassRoom {
    public double height;
    public double width;

    public ClassRoom() {
        this.height = 20;
        this.width = 30;
    }

    public ClassRoom(double height, double width) {
        this.height = height;
        this.width = width;
    }

    class Table{
        public int lgeNum;
        public double tableHeight;

        public Table() {
            this.lgeNum = 4;
            this.tableHeight = 20;
        }

        public Table(int lgeNum, double tableHeight) {
            this.lgeNum = lgeNum;
            this.tableHeight = tableHeight;
        }

        @Override
        public String toString() {
            return "Table{" +
                    "lgeNum=" + lgeNum +
                    ", tableHeight=" + tableHeight +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "ClassRoom{" +
                "height=" + height +
                ", width=" + width +
                ", table=" + new Table().toString() +
                '}';
    }
}
