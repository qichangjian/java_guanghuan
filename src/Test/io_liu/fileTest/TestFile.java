package Test.io_liu.fileTest;

import java.io.File;
import java.io.IOException;
import java.util.Date;

/**
 * 对文件的操作
 * exits
 */
public class TestFile {
    public static void main(String[] args) throws IOException {
        /**File  对文件和目录的操作，不涉及读写操作*/
        //方法一
       //File f = new File("d:\\data\\a.txt");//双斜杠表示路径
       // File f2 = new File("d:/data/a.txt");//反斜杠表示路径
        //方法二
       // File f3 = new File("d:/data/","a.txt");//父目录和要操作的文件两部分
        //方法三
        //File f4 = new File("d:/FileTest/");
        //File f = new File(f4,"a.txt");


        File f = new File(".","a.txt");
        //exist判断文件和文件夹目录是否存在 存在true
        System.out.println(f.exists());

        //新建一个文件  抛出异常
        f.createNewFile();

        //获得文件的名称
        System.out.println(f.getName());

        //获得路径
        //获得路径  如果是绝对路径显示绝对路径，如果是相对路径显示相对路径
        System.out.println(f.getPath());
        //获得绝对路径
        System.out.println(f.getAbsolutePath());

        //父目录
        System.out.println(f.getParent());//new File(".","a.txt"); 没有指定就是null  new File("a.txt");

        //是否是可以读写的
        System.out.println(f.canRead());
        System.out.println(f.canWrite());

        //是否是文件
        System.out.println(f.isFile());

        //文件最后一次修改的时间
        System.out.println(f.lastModified());//Long 返回毫秒
        long ms = f.lastModified();//将时间转换成日期
        Date date = new Date(ms);
        System.out.println(date);

        //文件内容字节大小
        System.out.println(f.length());

        //删除文件或者文件夹
        f.delete();
        System.out.println(f.exists());

    }
}
