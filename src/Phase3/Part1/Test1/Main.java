package Phase3.Part1.Test1;

/**
 * 编写一个函数，
 * 输入n为偶数时，调用方法求1/2+1/4+...+1/n,
 * 当输入n为奇数时，调用函数1/1+1/3+...+1/n
 */
public class Main {
    static double sum = 0;
    public static void main(String[] args) {
        System.out.println(sumNum(3));
        System.out.println(sumNum(4));
    }

    public static double sumNum(double number){
        if(number==1){
            return 1.0;
        }else if(number == 2){
            return (double)1/2; //千万要注意这里要类型转换
        }else{
            sum = 1/number + sumNum(number-2);
        }
        return sum;
    }
}
