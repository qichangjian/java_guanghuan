package Phase3.Part3.Task1;

import java.io.FileInputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("d:/Hello.java");
        byte[] bytes = new byte[fileInputStream.available()];
        fileInputStream.read(bytes);
        String s = new String(bytes,"utf-8");
        System.out.println(s);
    }
}
