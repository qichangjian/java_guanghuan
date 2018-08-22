package Test.testKaoshi;

public class Demo3_1 {
    public static void main(String[] args) {
        int sum =0;
        String s = new String("dlkdfs123456kk");
        char[] chars = s.toCharArray();//String转换成char数组
        for (int i = 0; i < chars.length; i++) {
            if(chars[i] <= '9'){
                if(chars[i] >= '0') {
                    sum += chars[i] - '0'; //char转换为int
                }
            }
        }
        System.out.println(sum);
    }
}
