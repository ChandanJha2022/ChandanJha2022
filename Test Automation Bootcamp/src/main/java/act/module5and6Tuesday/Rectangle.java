package act.module5and6Tuesday;

public class Rectangle extends Shape {

    // TODO: Implement calculateArea and calculatePerimeter methods

    //calculateArea
    @Override
    public double calculateArea(double length, double breadth, double radius) {
        double area = length * breadth;
        return area;
    }

    //calculatePerimeter
    @Override
    public double calculatePerimeter(double length, double breadth, double radius) {
        double perimeter = 2 * (length + breadth);
        return perimeter;
    }
}
