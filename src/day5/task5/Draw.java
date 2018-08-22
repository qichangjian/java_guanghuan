package day5.task5;

public class Draw {
    private int count;
    private int lines;

    public void drawTrian(){
        for (int i = 1; i <= getLines(); i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
                setCount(getCount()+1);
            }
            System.out.println();
        }
    }
    public void drawRec(){
        for (int i = 1; i <= getLines(); i++) {
            for (int j = 1; j <= this.lines; j++) {
                System.out.print("*");
                setCount(getCount()+1);
            }
            System.out.println();
        }
    }
    public void drawPra(){
        for (int i = 1; i <= getLines(); i++) {
            for (int j = getLines(); j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= this.lines; j++) {
                System.out.print("*");
                setCount(getCount()+1);
            }
            System.out.println();
        }
    }

    public Draw() {
    }

    public Draw(int count, int lines) {
        this.count = count;
        this.lines = lines;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getLines() {
        return lines;
    }

    public void setLines(int lines) {
        this.lines = lines;
    }

    @Override
    public String toString() {
        return "Draw{" +
                "count=" + count +
                ", lines=" + lines +
                '}';
    }
}
