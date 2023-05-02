import com.manjeet.employee.Employee;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Employee> employee = new ArrayList<>();

        employee.add(new Employee(101, "Manjeet", "Kumar", 2021));

        printEmployeeDetails(employee);


    }

    public static void printEmployeeDetails(List<Employee> employee) {
        System.out.println("Printing all employee details");
        for(Employee employee1 : employee) {
            printIndividualEmployeeDetails(employee1);
        }
    }

    public static void printIndividualEmployeeDetails(Employee employee1) {
        System.out.println("Employee ID - " + employee1.getEmpId());
        System.out.println("Employee firstName - " + employee1.getFirstName());
        System.out.println("Employee lastName - " + employee1.getSecondName());
        System.out.println("Employee Joining Year - " + employee1.getJoiningYear());
    }
}