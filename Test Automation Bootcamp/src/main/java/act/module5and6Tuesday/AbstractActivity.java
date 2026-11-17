package act.module5and6Tuesday;

public class AbstractActivity {

    static void main() {
        // TODO: Create a Rectangle object, set color to "Blue", and print the color
        Rectangle rectangle = new Rectangle();
        rectangle.setColor("Blue");
        System.out.println("Colour of Rectnagle is " +rectangle.getColor());

        // TODO: Print the area and perimeter of the rectangle (using length = 2, breadth = 4, radius = 0)
        //rectangle.calculateArea(2,4,0);
        System.out.println("Area of Rectangle is " +rectangle.calculateArea(2,4,0));
        //rectangle.calculatePerimeter(2,4,0);
        System.out.println("Perimeter of Rectangle is " +rectangle.calculatePerimeter(2,4,0));

        // TODO: Create a Circle object, set color to "Pink", and print the color
        Circle  circle = new Circle();
        circle.setColor("Pink");
        System.out.println("Colour of Circle is " +circle.getColor());

        // TODO: Print the area and perimeter of the circle (using length = 0, breadth = 0, radius = 5)
        System.out.println("Area of Circle is " +circle.calculateArea(0,0,5));
        System.out.println("Perimeter of Circle is " +circle.calculatePerimeter(0,0,5));
    }
}
