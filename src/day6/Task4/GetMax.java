package day6.Task4;

public class GetMax {
    public void max(int a,int b){
        if(a >= b){
            System.out.println("IntMax:" + a);
        }else{
            System.out.println("IntMax:" + b);
        }
    }

    public void max(double a,double b){
        if(a >= b){
            System.out.println("DoubleMax:" + a);
        }else{
            System.out.println("DoubleMax:" + b);
        }
    }

    public void max(double a,double b,double c){
        if(a >= b && a >= c){
            System.out.println("ThreeDoubleMax:" + a);
        }else if(b >= a && b >= c){
            System.out.println("ThreeDoubleMax:" + b);
        }else{
            System.out.println("ThreeDoubleMax:" + c);
        }
    }
}
