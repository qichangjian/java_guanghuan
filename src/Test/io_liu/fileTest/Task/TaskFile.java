package Test.io_liu.fileTest.Task;

import java.io.File;

public class TaskFile {
    public static void getPathFiles(File file){
        if(file.exists()){
            File[] fs = file.listFiles();//得到文件下的文件列表
            if(fs == null){
                System.out.println("文件夹下没有文件");
            }else{
                for (File s: fs) { //遍历文件列表
                    if(s.isDirectory()){ //文件列表中文件是否是目录
                        System.out.println("目录：" + s.getPath());
                        getPathFiles(s);//是目录就递归调用
                    }else{//是文件就输出
                        System.out.println("文件：" + s.getName());
                    }
                }
            }

        }else{
            System.out.println("没有该路径");
        }
    }

    public static void main(String[] args) {
        String path = "D:/myWrite";
        File file = new File(path);
        getPathFiles(file);
    }
}
