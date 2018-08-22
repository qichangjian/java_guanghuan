package day16.inputstream.Task1;

import java.io.FileOutputStream;
import java.io.IOException;
//内存写入文件
public class testOutputStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream fout = new FileOutputStream("d:/word.txt");
        String str = "Helloword";
        fout.write(str.getBytes(),5,4);
        fout.close();
    }
}
