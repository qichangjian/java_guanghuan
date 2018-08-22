package day10.Task3;

public class ProcessArray {
    public int process(int[] target,Commond commond) {
        commond = (int[] target1)->{
            int sum = 0;
            for (int t:target1) {
                sum += t;
            }
            return sum;
        };

        return commond.process(target);
    }
}
