package module10JavaFinalActivitiesFriday;

public abstract class Person {


    //Attributes
    String name;
    int age;

    //Getter for name
    public String getName() {
        return name;
    }

    //setter for  name
    public void setName(String name) {
        this.name = name;
    }

    //getter for age
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //introduce method
    public void introduce() {
        System.out.println("My Name is " + this.getName());
        System.out.println("My Age is " + this.getAge());
    }
}
