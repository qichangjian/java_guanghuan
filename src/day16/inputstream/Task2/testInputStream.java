package day16.inputstream.Task2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class testInputStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fin = new FileInputStream("d:/a.mp3");
        FileOutputStream fout = new FileOutputStream("d:/new.mp3");
        byte[] bfin = new byte[fin.available()];//缓冲数组
        fin.read(bfin);//读取原来mp3
        fout.write(bfin);//写入新的文件
        fout.close();//关闭流
        fin.close();
    }
}
