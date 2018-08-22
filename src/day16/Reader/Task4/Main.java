package day16.Reader.Task4;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("d:/Hello.java");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        StringBuffer stringBuffer = new StringBuffer();
        String temp;
        while((temp = bufferedReader.readLine()) != null){
            stringBuffer.append(temp);
            stringBuffer.append("\n");
        }
        System.out.println(stringBuffer.toString());
        bufferedReader.close();


        //写
        FileWriter fileWriter = new FileWriter("d:/new.java");
        fileWriter.write(stringBuffer.toString());

        fileWriter.close();

    }
}
