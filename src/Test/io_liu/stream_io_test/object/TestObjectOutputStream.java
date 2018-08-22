package Test.io_liu.stream_io_test.object;

import java.io.*;

/**
 * 序列化
 */
public class TestObjectOutputStream {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //序列化 将对象永久性保存在文件中
        //对象要实现 Serializable接口 这个接口只是个标志

        //序列化：把对象转换成字节序列 就是把对象存储到磁盘文件中
        Student guojing = new Student();
        guojing.setName("郭靖");
        guojing.setNo(11);
        //1
        File f = new File("D:\\IdeaProjects-workspace\\src\\Test\\io_liu\\stream_io_test\\d.txt");
        FileOutputStream fout = new FileOutputStream(f);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fout);
        //2.写
        objectOutputStream.writeObject(guojing);
        //3.close
        objectOutputStream.close();


        //反序列化---------------就是读取文件中的内容
        //反序列化：读 把文件中内容读取出来 （就是把字符序列还原成对象）
        FileInputStream fin = new FileInputStream(f);
        ObjectInputStream objectInputStream = new ObjectInputStream(fin);
        //2 读取出来，还原成对象
        Student stu = (Student) objectInputStream.readObject();
        System.out.println(stu.getName());
        //3 close
        objectInputStream.close();
    }
}

class Student implements Serializable {
    //反序列化的时候解决版本号不同的问题  如果不加入，类修改后，因为版本号不同，所以不能够反序列化
    private static final long serialVersionUID = 1L;//设置版本号为1

    private int no;
    private String name;

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
