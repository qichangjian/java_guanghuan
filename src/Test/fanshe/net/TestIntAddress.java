package Test.fanshe.net;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 *  得到本机的IP
 */
public class TestIntAddress {
    public static void main(String[] args) throws UnknownHostException {
        //本机IP
        System.out.println(InetAddress.getLocalHost());
        //根据本机名称查找IP
        System.out.println(InetAddress.getByName("admin-PC"));
        //得到本机名字  和  本机IP地址
        System.out.println(InetAddress.getLocalHost().getHostName());
        System.out.println(InetAddress.getLocalHost().getHostAddress());
    }
}
