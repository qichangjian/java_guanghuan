package day6.Task4;

public class Main {
    public static void main(String[] args) {
        int a = 1,b=2;
        double aa = 11, bb = 33,cc = 22;
        GetMax g = new GetMax();
        g.max(a,b);
        g.max(aa,bb);
        g.max(aa,bb,cc);
    }
}
