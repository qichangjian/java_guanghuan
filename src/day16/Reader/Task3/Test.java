package day16.Reader.Task3;

import java.io.*;

public class Test {
    public static void main(String[] args) throws IOException {
        File f = new File("d:/Hello.java");
        PrintWriter pw = new PrintWriter(f);

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s = bufferedReader.readLine();
        pw.write(s);
        pw.close();



    }
}
