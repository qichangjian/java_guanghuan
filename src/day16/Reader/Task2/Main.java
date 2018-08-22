package day16.Reader.Task2;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("d:/Hello.java");
        String s = "好好学习Java";
        fw.write(s);
        fw.close();
    }
}
