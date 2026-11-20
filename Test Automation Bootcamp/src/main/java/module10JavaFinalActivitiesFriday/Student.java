package module10JavaFinalActivitiesFriday;

public class Student extends Person {

    //Attribute
    String schoolName;

    //getter for schoolName
    public String getSchoolName() {
        return schoolName;
    }

    //setter for schoolName
    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    //override
    public void introduce() {
        System.out.println("I am study in University " + getSchoolName());
    }
}
