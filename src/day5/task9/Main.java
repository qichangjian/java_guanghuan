package day5.task9;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[3];
        employees[0] = new Employee("1","Tom","111111",175,100);
        employees[1] = new Employee("2","Jesson","22222",180,200);
        employees[2] = new Employee("3","Bruce","33333",185,300);
        EmployeeManager employeeManager = new EmployeeManager();
        System.out.println("平均高度：" + employeeManager.getSumHeight(employees));
        System.out.println("总价格" + employeeManager.getSumPrice(employees));
    }
}
