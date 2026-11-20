package module10JavaFinalActivitiesFriday;

import java.util.ArrayList;
import java.util.List;

public class EmployeeList {

    static void main(String[] args) {

        //create five employee objects
        Employee emp1 = new Employee("Ram", 21, "Full Stack Developer", "Accenture", 550000);
        Employee emp2 = new Employee("Shyam", 31, "Sr. Manager", "Google", 880000);
        Employee emp3 = new Employee("Rajiv", 28, "Junior Tester", "Global Logic", 660000);
        Employee emp4 = new Employee("Rajesh", 35, "Sr. Analyst", "Deloitte", 770000);
        Employee emp5 = new Employee("Harry Potter", 33, "Unit Director", "Meta", 990000);

        // 4.2 Create ArrayList of Employees
        List<Employee> empList = new ArrayList<Employee>();

        // Add all 5 employees to the list
        empList.add(emp1);
        empList.add(emp2);
        empList.add(emp3);
        empList.add(emp4);
        empList.add(emp5);

//        // Store employee list
        emp1.setEmployeelist(empList);

        // 4.4 Print highest-paid employee
        System.out.println("The Employee whose salary is the highest is : " + emp1.highestPaidEmployee());
    }
}
