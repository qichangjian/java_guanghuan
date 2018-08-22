package day10.Task3;

public class Main {
    public static void main(String[] args) {
        int[] test = {1,2,3,4,5};
        Commond commond = (int[] target)->{
            int sum = 0;
            for (int t:target) {
                sum += t;
            }
            return sum;
        };
        System.out.println("数组sum:" + commond.process(test));

        System.out.println("-------------------------------");
        ProcessArray processArray = new ProcessArray();
        System.out.println("调用方法的sum : " + processArray.process(test,commond));
    }

}
