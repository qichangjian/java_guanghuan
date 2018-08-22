package day12.Task3;

public class Main {
    public static void main(String[] args) throws Exception {
        isTriangle(1,2,3);
    }

    public static void isTriangle(int a,int b,int c) throws Exception{
        if(a+b>c && a+c>b && b+c>a){
            System.out.println("能够成三角形");
        }else{
            throw new Exception("a,b,c不能构成三角形");
        }
    }
}
