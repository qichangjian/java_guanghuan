package day3_2;
/**
 *任务二：  计算出输出结果。
 * 1+1/2!+1/3!+ …… 1/20!
 * 使用double参考结果： 1.7182818284590455
 * 提示：2！ 阶乘是 1*2 ；3！是1*2*3；4！是1*2*3*4；
 */
public class Task2 {
    public static void main(String[] args) {
        //System.out.println(sum(20)); //递归方法
        //方法1
        double sum = 0;
        double a = 20;
        while(a>0){
            sum += 1/a;
            a--;
        }
        System.out.println(sum);
    }
    //方法二：递归调用方法
    /*public static double sum(double num){
        if(num == 1){
            return 1;
        }else{
            return 1/num + sum(num-1);
        }
    }*/
}
