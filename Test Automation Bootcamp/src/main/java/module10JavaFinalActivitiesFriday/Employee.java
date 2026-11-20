package module10JavaFinalActivitiesFriday;

import java.util.List;

public class Employee extends Person {

    //Attributes
    String jobTitle;
    String company;
    double salary;

    //list of employees
    List<Employee> employeelist;

    //default constructor
    public Employee() {
    }

    //parameterized constructor (this class params)
    public Employee(String jobTitle, String company, double salary) {
        this.jobTitle = jobTitle;
        this.company = company;
        this.salary = salary;
    }

    //parameterized constructor (all params)
    public Employee(String name, int age, String jobTitle, String company, double salary) {
        setName(name);
        setAge(age);
        this.jobTitle = jobTitle;
        this.company = company;
        this.salary = salary;
    }

    //getters for jobTitle
    public String getJobTitle() {
        return jobTitle;
    }

    //setters for jobTitle
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    //getters for company
    public String getCompany() {
        return company;
    }

    //setters for company
    public void setCompany(String company) {
        this.company = company;
    }

    //getter for salary
    public double getSalary() {
        return salary;
    }

    //setters for salary
    public void setSalary(double salary) {
        this.salary = salary;
    }

    //override
    public void introduce() {
        System.out.println("My name is " + this.getName() + " and i am " + getAge() + " years old");
        System.out.println("I am work as " + jobTitle + " in " + company + " and my salary is " + salary);
    }

    //store employee list
    public void setEmployeelist(List emplist) {
        employeelist = emplist;
    }

    // return highest paid employee
    public String highestPaidEmployee() {
        if (employeelist == null || employeelist.isEmpty()) {
            return "0 Employee";
        }
        Employee highestPaid = employeelist.get(0);

        for (int i = 1; i < employeelist.size(); i++) {
            if (employeelist.get(i).getSalary() > highestPaid.getSalary())
                highestPaid = employeelist.get(i);
        }
        return highestPaid.getName();
    }

}
