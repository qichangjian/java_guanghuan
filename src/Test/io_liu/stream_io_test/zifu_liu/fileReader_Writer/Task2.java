package Test.io_liu.stream_io_test.zifu_liu.fileReader_Writer;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Task2 {
    public static void main(String[] args) throws IOException {
        Dog dog = new Dog("小白","藏獒","毛泽东");
        File f = new File("D:\\IdeaProjects-workspace\\src\\Test\\io_liu\\stream_io_test\\temp.txt");
        FileReader fr = new FileReader(f);
        StringBuffer sf = new StringBuffer();
        int temp;
        while((temp = fr.read()) != -1){
            sf.append((char)temp);
        }
        String s = sf.toString(); //得到string 字符串
        s = s.replace("{name}",dog.getName());//利用replace替换
        s = s.replace("{type}",dog.getType());
        s = s.replace("{master}",dog.getMaster());
        System.out.println(s);
        fr.close();

        //读取
        FileWriter fw = new FileWriter(f);
        fw.write(s);
        fw.close();

    }
}

class Dog{
    private String name;
    private String type;
    private String master;

    public Dog() {
    }

    public Dog(String name, String type, String master) {
        this.name = name;
        this.type = type;
        this.master = master;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", master='" + master + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMaster() {
        return master;
    }

    public void setMaster(String master) {
        this.master = master;
    }
}


