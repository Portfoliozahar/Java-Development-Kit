package work4;

import java.util.List;


public class Main {
    public static void main(String[] args) {

        SecondDirectory directory = new SecondDirectory();


        directory.addEmployee(1, "+2398475904", "Гаврилов", 5);
        directory.addEmployee(2, "+9234890234", "Смирнова", 3);
        directory.addEmployee(3, "+2475г67345", "Немцов", 5);


        List<SecondDirectory.Employee> employeesWithExperience5 = directory.findEmpl(5);
        System.out.println("Стаж 5 лет:");
        for (SecondDirectory.Employee employee : employeesWithExperience5) {
            System.out.println(employee.getName());
        }


        String phoneNumber = directory.findPhone("Немцов");
        System.out.println("Номер телефона: " + phoneNumber);


        SecondDirectory.Employee employee = directory.findEmployeeWithId(2);
        if (employee != null) {
            System.out.println("Сотрудник с номером 2 найден: " + employee.getName());
        } else {
            System.out.println("Сотрудник с номером 2 не найден.");
        }
    }
}