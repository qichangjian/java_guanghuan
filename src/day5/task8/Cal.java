package day5.task8;

public class Cal {
    public int calculation(int n1,int n2,String operator){
        int sum = 0;
        switch (operator){
            case "+":
                sum = n1 + n2;
                break;
            case "-":
                sum = n1 - n2;
                break;
            case "*":
                sum = n1 * n2;
                break;
            case "/":
                sum = n1 / n2;
                break;
            default:
                System.out.println("输入错误！");
                break;
        }
        return sum;
    }
}
