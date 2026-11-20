package module10JavaFinalActivitiesFriday;

public class Bike implements Vehicle {

    //override start method from vehicle interface
    @Override
    public void start() {

        System.out.println("Bike is starting");
    }

    //override stop method from vehicle interface
    @Override
    public void stop() {
        System.out.println("Bike is stopping");
    }
}
