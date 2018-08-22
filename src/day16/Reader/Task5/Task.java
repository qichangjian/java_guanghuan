package day16.Reader.Task5;

import java.io.IOException;
import java.io.PrintWriter;

public class Task {
    public static void main(String[] args) throws IOException {
        PrintWriter pw = new PrintWriter("d:/Hello.java");
        for (int i = 1; i <=6; i++) {
            pw.write("星期" + i);
        }
        pw.close();
    }
}
