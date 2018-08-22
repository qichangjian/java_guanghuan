package Test.fanshe.net;

import java.net.MalformedURLException;
import java.net.URL;

//得到url的各个部分信息
public class TestURL {
    public static void main(String[] args) throws MalformedURLException {
        URL url = new URL("http://127.0.0.1:5678/data/a.txt?no=1&page=2#Hello");
        System.out.println(url.getProtocol());
        System.out.println(url.getHost());
        System.out.println(url.getPort());
        System.out.println(url.getDefaultPort());//80
        System.out.println(url.getQuery());
        System.out.println(url.getRef());
    }
}
