package day8.Task4;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee(1,"男","张三","业务员",3000,4);
        System.out.println(employee.toString());
        employee.display();
        int salayNow = employee.getDecMoney(employee.getHolidays());
        System.out.println(employee.toString());

        Director director = new Director(1,"男","李四","董事长",3000,4,"张三");
        director.getDecMoney(director.getHolidays());
        System.out.println(director.toString());
    }
}
