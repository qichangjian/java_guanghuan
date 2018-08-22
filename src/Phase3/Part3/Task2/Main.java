package Phase3.Part3.Task2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        PrintWriter pw = new PrintWriter("d:/Dest.txt");
        pw.write("100,101,102,103,104,105");
        pw.close();
        BufferedReader bf = new BufferedReader(new FileReader("d:/Dest.txt"));
        StringBuffer stringBuffer = new StringBuffer();
        String s;
        while((s = bf.readLine()) != null){
            String[] ss = s.split(",");
            for (int i = 0; i < ss.length; i++) {
                stringBuffer.append(ss[i]);
            }
        }
        System.out.println(stringBuffer.reverse().toString());
    }
}
