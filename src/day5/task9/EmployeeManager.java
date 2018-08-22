package day5.task9;

public class EmployeeManager {

   public double getSumPrice(Employee[] employee){
       int sumPrice = 0;
       for (int i = 0; i < employee.length; i++) {
           sumPrice += employee[i].getePrice();
       }
       return sumPrice;
   }

    public double getSumHeight(Employee[] employee){
        int sumHeight = 0;
        for (int i = 0; i < employee.length; i++) {
            sumHeight += employee[i].geteHeight();
        }
        return sumHeight/employee.length;
    }
}
