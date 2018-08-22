package Test.io_liu.fileTest;

import java.io.File;

/**
 * 创建目录
 */
public class TestFile3 {
    public static void main(String[] args) {
        File f = new File("d:/myWrite/day2");
        File f1 = new File("d:/myWrite1/day2");
        System.out.println(f.exists());
        //mkdir 不会创建父目录
        f.mkdir();
        f1.mkdir();//没有父目录，不会创建父目录

        //mkdirs 直接创建,不管有没有父目录
        f1.mkdirs();



    }
}
