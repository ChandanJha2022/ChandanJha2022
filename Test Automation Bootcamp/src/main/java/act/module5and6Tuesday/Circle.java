package act.module5and6Tuesday;

public class Circle extends Shape {

    // TODO: Implement calculateArea and calculatePerimeter methods

    //calculateArea
    @Override
    public double calculateArea(double length, double breadth, double radius) {
        double area = 3.14 * radius * radius;
        return area;
    }

    //calculatePerimeter
    @Override
    public double calculatePerimeter(double length, double breadth, double radius) {
        double perimeter = 2 * 3.14 * radius;
        return perimeter;
    }
}
