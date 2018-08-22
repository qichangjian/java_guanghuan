package day16.Reader.Task1;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        File f = new File("d:/Hello.java");
        FileReader fr = new FileReader(f);

        /*StringBuffer stringBuffer = new StringBuffer();
        int temp;
        while((temp = fr.read()) != -1){
            stringBuffer.append((char)temp);
        }
        System.out.println(stringBuffer);
        fr.close();*/

        //2.
        BufferedReader bf = new BufferedReader(fr);
        String s;
        while((s = bf.readLine()) != null){
            System.out.println(s);
        }
        bf.close();
    }
}
