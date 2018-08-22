package day6.Task1;

public class CalMoney {

    //项目经理
    public double getMoney(double basepay,double projectBonus,double bonus){
        return basepay + projectBonus + bonus;
    }

    //程序员
    public double getMoney(double basePay,double sale){
        return basePay + sale;
    }

    //清洁工
    public double getMoney(double basePay){
        return basePay;
    }

}
