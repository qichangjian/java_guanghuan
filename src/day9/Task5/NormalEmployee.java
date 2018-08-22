package day9.Task5;

public class NormalEmployee extends Employee {
    @Override
    int getDecMoney(int day) {
        int salays=0;
        if(day <= 3){
            salays = 20*(30-day);
        }else{
            salays = 15*(30-day);
        }
        return salays;
    }
}
