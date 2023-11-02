package work4;

import java.util.ArrayList;
import java.util.List;

public class SecondDirectory {
    private List<Employee> employees = new ArrayList<>();


    public class Employee {
        private int employeeId;
        private String phoneNumber;
        private String name;
        private int experience;

        public Employee(int employeeId, String phoneNumber, String name, int experience) {
            this.employeeId = employeeId;
            this.phoneNumber = phoneNumber;
            this.name = name;
            this.experience = experience;
        }

        public int getEmployeeId() {
            return employeeId;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public String getName() {
            return name;
        }

        public int getExp() {
            return experience;
        }
    }


    public void addEmployee(int employeeId, String phoneNumber, String name, int experience) {
        Employee newEmployee = new Employee(employeeId, phoneNumber, name, experience);
        employees.add(newEmployee);
    }


    public List<Employee> findEmpl(int targetExperience) {
        List<Employee> result = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.getExp() == targetExperience) {
                result.add(employee);
            }
        }
        return result;
    }


    public String findPhone(String targetName) {
        for (Employee employee : employees) {
            if (employee.getName().equals(targetName)) {
                return employee.getPhoneNumber();
            }
        }
        return "Сотрудник с такаим именем " + targetName + " не найден.";
    }


    public Employee findEmployeeWithId(int employeeId) {
        for (Employee employee : employees) {
            if (employee.getEmployeeId() == employeeId) {
                return employee;
            }
        }
        return null;
    }
}