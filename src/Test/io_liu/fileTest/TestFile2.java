package Test.io_liu.fileTest;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

/**
 * File 对目录的操作
 */
public class TestFile2 {
    public static void main(String[] args) {
        File f = new File("d:/myWrite/day1");
        //是否存在
        System.out.println(f.exists());
        //是否是目录 文件夹
        System.out.println(f.isDirectory());
        //获得目录下的子目录 的文件 和字符串形式
        System.out.println("------文件下子目录");  //得到
        String [] fs = f.list();
        for (String s:fs) {
            System.out.println(s);
        }
        //过滤显示结果
        String[] fs1 = f.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.endsWith(".java");//过滤，只要后缀为javad的文件
            }
        });
        String[] fs11 = f.list((d,name)->name.endsWith(".class"));//文件名过滤器
        for (String s: fs11) {
            System.out.println(s);
        }

        //获得目录下的子目录和文件的File形式
        File[] fs3 = f.listFiles();
        for (File ff: fs3) {
            if(ff.isDirectory()){
                System.out.println("路径：" + ff.getPath());
            }else{
                System.out.println("文件：" + ff.getName());
            }
        }
        //过滤
        File[] fs33 = f.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.getName().endsWith("java");//筛选
            }
        });
        File[] fs333 = f.listFiles(pathname -> pathname.getName().endsWith("java"));
        for (File ff: fs333) {
            if(ff.isDirectory()){
                System.out.println("路径：" + ff.getPath());
            }else{
                System.out.println("文件：" + ff.getName());
            }
        }

    }
}
