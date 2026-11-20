package module10JavaFinalActivitiesFriday;

public class AbstractActivity {

    static void main(String[] args) {

        //object of employee class
        Employee employee = new Employee();

        //assigning attributes details here for employee
        employee.setName("Chandan");
        employee.setAge(31);
        employee.setJobTitle("Automation Quality Engineer");
        employee.setSalary(5000);
        employee.setCompany("Accenture");

        //calling introduce from employee
        employee.introduce();

        //object for student class
        Student student = new Student();

        //assigning attributes details for student here
        student.setName("Chandan");
        student.setAge(31);
        student.setSchoolName("of Latvia");

        //calling introduce method for student
        student.introduce();
    }
}
